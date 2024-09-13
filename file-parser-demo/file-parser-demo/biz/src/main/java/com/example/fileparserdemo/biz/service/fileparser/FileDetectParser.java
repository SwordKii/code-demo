package com.example.fileparserdemo.biz.service.fileparser;

import com.example.fileparserdemo.filetypedetector.DefaultFileDetector;
import com.example.filepaserdemo.fileparsers.interf.FileParser;
import com.example.filepaserdemo.fileparsers.interf.entity.AbstractFileContent;
import com.example.filepaserdemo.fileparsers.interf.entity.File;
import com.example.filepaserdemo.fileparsers.interf.exception.ParserException;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/10 17:58
 */
public class FileDetectParser implements FileParser {
    private static final ExecutorService executorService = new ThreadPoolExecutor(0, 10, 10, TimeUnit.SECONDS,
            new SynchronousQueue<>(), new ThreadPoolExecutor.CallerRunsPolicy());
    public static final FileDetectParser INSTANCE = new FileDetectParser();

    private DefaultFileDetector fileDetector;

    private FileDetectParser() {
        this.fileDetector = new DefaultFileDetector();
    }

    public FileDetectParser(DefaultFileDetector fileDetector) {
        this.fileDetector = fileDetector;
    }

    @Override
    public Set<String> getSupportedTypes() {
        // this is proxy
        return Collections.emptySet();
    }

    @Override
    public String getFileContentString(File file) throws ParserException {
        try {
            return executorService.submit(() -> {
                String type = fileDetector.detect(file.getInputStream(), file.getName());
                return FileParserManager.getFileParser(type).getFileContentString(file);
            }).get();
        } catch (Exception e) {
            throw new ParserException(e);
        }
    }

    @Override
    public String getFileBody(File file) throws ParserException {
        try {
            return executorService.submit(() -> {
                String type = fileDetector.detect(file.getInputStream(), file.getName());
                return FileParserManager.getFileParser(type).getFileBody(file);
            }).get();
        } catch (Exception e) {
            throw new ParserException(e);
        }
    }

    @Override
    public AbstractFileContent getFileContent(File file) throws ParserException {
        try {
            return executorService.submit(() -> {
                String type = fileDetector.detect(file.getInputStream(), file.getName());
                return FileParserManager.getFileParser(type).getFileContent(file);
            }).get();
        } catch (Exception e) {
            throw new ParserException(e);
        }
    }
}
