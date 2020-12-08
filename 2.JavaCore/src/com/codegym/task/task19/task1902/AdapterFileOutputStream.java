package com.codegym.task.task19.task1902;

/* 
Adapter

*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        byte[] bytes = s.getBytes();
        fileOutputStream.write(bytes);
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }

    public static void main(String[] args) {

    }

}

