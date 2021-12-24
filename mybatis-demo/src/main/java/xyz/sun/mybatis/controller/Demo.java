package xyz.sun.mybatis.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author sundewang
 * @date 2020/11/2
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\sun\\Downloads\\a.txt");
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path.toFile()));
        out.write("test".getBytes());
        out.close();
    }
}
