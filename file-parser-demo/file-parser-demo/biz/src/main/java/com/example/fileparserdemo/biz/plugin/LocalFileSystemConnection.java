package com.example.fileparserdemo.biz.plugin;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.AuthenticationException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.CommunicationException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.ExecutionException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.FileSystemConnection;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.dto.FileArchitecture;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.qo.DirectoryQO;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.qo.FileQO;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.enums.FileTypeEnum;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/10 17:39
 */
@Slf4j
public class LocalFileSystemConnection implements FileSystemConnection {
    @Override
    public List<FileArchitecture> getFiles(DirectoryQO directoryQO) throws ExecutionException {
        String fullDirectory = directoryQO.getFullDirectory();
        try (Stream<Path> list = Files.list(Paths.get(fullDirectory))) {
            return list.map(path -> {
                FileArchitecture fileArchitecture = new FileArchitecture();
                fileArchitecture.setSize(path.toFile().length());
                fileArchitecture.setName(path.getFileName().toString());
                fileArchitecture.setType(Files.isDirectory(path) ? FileTypeEnum.DIRECTORY : FileTypeEnum.FILE);
                fileArchitecture.setFullDirectory(fullDirectory);
                try {
                    fileArchitecture.setCreateTime(((FileTime) Files.getAttribute(path, "creationTime")).toInstant().toEpochMilli());
                } catch (Exception e) {
                    log.warn("Failed to get createTime!", e);
                }
                try {
                    fileArchitecture.setModifyTime(((FileTime) Files.getAttribute(path, "lastWriteTime")).toInstant().toEpochMilli());
                } catch (Exception e) {
                    log.warn("Failed to get lastWriteTime!", e);
                }
                return fileArchitecture;
            }).collect(Collectors.toList());
        } catch (IOException e) {
            throw new ExecutionException(e);
        }
    }

    @Override
    public InputStream getFileInputStream(FileQO fileQO) throws ExecutionException {
        String pathStr = fileQO.getDirectory().getFullDirectory() + "/" + fileQO.getName();
        try {
            return Files.newInputStream(Paths.get(pathStr));
        } catch (IOException e) {
            throw new ExecutionException(e);
        }
    }

    @Override
    public boolean testConnection() throws CommunicationException, AuthenticationException {
        return true;
    }

    @Override
    public void close() throws Exception {
        // do nothing
    }
}
