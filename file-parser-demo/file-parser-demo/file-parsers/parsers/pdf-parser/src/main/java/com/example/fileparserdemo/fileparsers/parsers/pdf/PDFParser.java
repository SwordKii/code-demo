package com.example.fileparserdemo.fileparsers.parsers.pdf;

import com.example.filepaserdemo.fileparsers.interf.FileParser;
import com.example.filepaserdemo.fileparsers.interf.entity.AbstractFileContent;
import com.example.filepaserdemo.fileparsers.interf.entity.File;
import com.example.filepaserdemo.fileparsers.interf.exception.ParserException;
import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;

import java.io.BufferedInputStream;
import java.util.Collections;
import java.util.Set;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/11 16:27
 */
public class PDFParser implements FileParser {
    private Tika tika = new Tika();

    @Override
    public Set<String> getSupportedTypes() {
        return Collections.singleton("application/pdf");
    }

    @Override
    public String getFileContentString(File file) throws ParserException {
        Parser parser = new AutoDetectParser();
        Metadata meta = new Metadata();

        ParseContext parsecontext = new ParseContext();
        parsecontext.set(Parser.class, parser);

        meta.set(TikaCoreProperties.RESOURCE_NAME_KEY, file.getName());
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(file.getInputStream())) {
            ContentHandler handler = new BodyContentHandler();
            parser.parse(bufferedInputStream, handler, meta, parsecontext);
            return handler.toString();
        } catch (Exception e) {
            throw new ParserException(e);
        }
    }

    @Override
    public String getFileBody(File file) throws ParserException {
        // todo
        return "";
    }

    @Override
    public AbstractFileContent getFileContent(File file) throws ParserException {
        // todo
        return null;
    }
}
