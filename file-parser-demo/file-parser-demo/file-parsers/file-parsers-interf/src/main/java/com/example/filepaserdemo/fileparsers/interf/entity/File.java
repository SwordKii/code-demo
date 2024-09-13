package com.example.filepaserdemo.fileparsers.interf.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/11 14:54
 */
@Data
@NoArgsConstructor
public class File implements AutoCloseable{
    /**
     * 文件名称
     */
    private String name;
    /**
     * 文件内容
     */
    private InputStream inputStream;

    public File(String name, InputStream inputStream) {
        this.name = name;
        this.inputStream = getBufferedInputStream(inputStream);
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = getBufferedInputStream(inputStream);
    }

    private InputStream getBufferedInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        if (!inputStream.markSupported()) {
            // 转换成缓存，以支持mark和reset，stream可重复读
            // todo 内存问题
            return new BufferedInputStream(inputStream, 1024);
        }
        return inputStream;
    }

    @Override
    public void close() throws Exception {
        if (this.inputStream != null) {
            inputStream.close();
        }
    }
}
