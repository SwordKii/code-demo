package com.example.fileparserdemo.filetypedetector;

import java.io.InputStream;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/12 15:31
 */
public interface FileDetector {

    /**
     * 获取mimeType
     *
     * @param stream
     * @return
     */
    String detect(InputStream stream, String name);

    /**
     * mimeType是否为结构化文档类型
     * todo 根据类型判断，还是根据内容判断，txt是否数据结构化文档
     * @param mimeType
     * @return
     */
    boolean isStructuredFile(String mimeType);
}