package com.example.fileparserdemo.filetypedetector;

import com.example.fileparserdemo.filetypedetector.util.YamlUtil;
import org.apache.tika.Tika;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * tika fileDetector
 *
 * @author wangjian2
 * @date 2024/9/11 10:48
 */
public class DefaultFileDetector implements FileDetector {

    private Tika tika = new Tika();

    private static final List<String> STRUCTURED_FILE_MIME_TYPES = (List<String>) YamlUtil.getProperty(YamlUtil.STRUCTURED_FILES);

    @Override
    public String detect(InputStream stream, String name) {
        if (stream == null) {
            return null;
        }
        if (!stream.markSupported()) {
            stream = new BufferedInputStream(stream);
        }
        String mimeType = null;
        try {
            mimeType = tika.detect(stream, name);
        } catch (IOException e) {
            return null;
        }
        return mimeType;
    }

    @Override
    public boolean isStructuredFile(String mimeType) {
        if (mimeType == null) {
            return false;
        }

        if (STRUCTURED_FILE_MIME_TYPES.contains(mimeType)) {
            return true;
        }
        return false;
    }
}
