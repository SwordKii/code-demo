package com.example.filepaserdemo.fileparsers.interf;

import com.example.filepaserdemo.fileparsers.interf.entity.AbstractFileContent;
import com.example.filepaserdemo.fileparsers.interf.entity.File;
import com.example.filepaserdemo.fileparsers.interf.exception.ParserException;

import java.io.IOException;
import java.util.Set;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/10 18:08
 */
public interface FileParser {

    Set<String> getSupportedTypes();

    /**
     * 获取文件有效内容
     *
     * @return
     */
    String getFileContentString(File file) throws ParserException;

    /**
     * 获取文件正文部分
     * @return
     */
    String getFileBody(File file) throws ParserException;


    /**
     * 获取文件内容结构
     * @return
     */
    AbstractFileContent getFileContent(File file) throws ParserException;

}