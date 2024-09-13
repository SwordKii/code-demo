package com.example.filepaserdemo.fileparsers.interf.entity;

import lombok.Data;

import java.io.InputStream;
import java.util.List;

/**
 * 非结构化文件内容
 *
 * @author wangjian2
 * @date 2024/9/10 18:13
 */
@Data
public class UnstructuredFileContent extends AbstractFileContent {
    /**
     * 页眉
     */
    private List<String> header;
    /**
     * 标题
     */
    private List<String> title;
    /**
     * 正文
     */
    private String body;
    /**
     * 脚注
     */
    private List<String> footnote;
    /**
     * 页脚
     */
    private List<String> footer;
    /**
     * 尾注
     */
    private List<String> endnote;
    /**
     * 批注
     */
    private List<String> comment;
    /**
     * 嵌入文件
     */
    private List<InputStream> embeddedFiles;
}
