package com.example.fileparserdemo.biz.service.fileparser;

import com.example.fileparserdemo.biz.plugin.LocalFileSystemDriver;
import com.example.filepaserdemo.fileparsers.interf.entity.File;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity.DataSourceConnectionParam;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.FileSystemConnection;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.dto.FileArchitecture;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.qo.DirectoryQO;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.qo.FileQO;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class FileDetectParserTest {

    @Test
    public void getFileContentStringAsync() {
        ExecutorService executorService = new ThreadPoolExecutor(0, 5, 10, TimeUnit.SECONDS,
                new SynchronousQueue<>(), new ThreadPoolExecutor.CallerRunsPolicy());
        while (true) {
            executorService.submit(() -> {
                try {
                    getFileContentString();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    @Test
    public void getFileContentString() throws InterruptedException, URISyntaxException, IOException {
        String directory = Paths.get(this.getClass().getResource("/testfile").toURI()).toAbsolutePath().toString();
        DirectoryQO directoryQO = new DirectoryQO(directory);
        FileSystemConnection connection = new LocalFileSystemDriver().connect(new DataSourceConnectionParam());
        List<FileArchitecture> files = connection.getFiles(directoryQO);
        List<FileArchitecture> list = files.stream()
                .filter(fileArchitecture -> fileArchitecture.getName().endsWith(".pdf"))
                .collect(Collectors.toList());

        for (FileArchitecture fileArchitecture : list) {
            FileQO fileQO = new FileQO();
            fileQO.setName(fileArchitecture.getName());
            fileQO.setDirectory(directoryQO);
            InputStream fileInputStream = connection.getFileInputStream(fileQO);

            File file = new File(fileArchitecture.getName(), fileInputStream);
            String fileContentString = FileDetectParser.INSTANCE.getFileContentString(file);
            //Files.write(Paths.get(this.getClass().getResource("/result.txt").toURI()),
            //        fileContentString.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            System.out.println(fileArchitecture.getName() + "done");
        }
    }

    @Test
    public void getFileBody() {
    }

    @Test
    public void getFileContent() {
    }
}