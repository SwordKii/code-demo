package com.example.fileparserdemo.biz.service.fileparser;

import com.example.filepaserdemo.fileparsers.interf.FileParser;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/11 11:08
 */
@Slf4j
public class FileParserManager {
    private static final ConcurrentHashMap<String, FileParser> fileParserMap = new ConcurrentHashMap<>();

    static {
        loadInitialProcessor();
        log.info("load processor init success");
    }

    private static void loadInitialProcessor() {
        ServiceLoader<FileParser> load = ServiceLoader.load(FileParser.class);
        Iterator<FileParser> iterator = load.iterator();
        while (iterator.hasNext()) {
            FileParser next = iterator.next();
            Set<String> supportedTypes = next.getSupportedTypes();

            List<String> alreadyLoadedType = new ArrayList<>();
            supportedTypes.stream().forEach(type -> {
                if (fileParserMap.containsKey(type)) {
                    alreadyLoadedType.add(type);
                }
            });

            if (!alreadyLoadedType.isEmpty()) {
                log.error("type {} has already been loaded! This parser {} skipped", alreadyLoadedType, next.getClass().getName());
            } else {
                supportedTypes.stream().forEach(type -> fileParserMap.put(type, next));
            }
        }
    }

    public static FileParser getFileParser(String mimeType) {
        if (!fileParserMap.containsKey(mimeType)) {
            throw new IllegalArgumentException("mimeType " + mimeType + " not exist");
        }
        return fileParserMap.get(mimeType);
    }
}
