package com.codegym.task.task18.task1812;

import java.io.*;

/* 
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream amigoOutputStream;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) throws IOException {
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.close();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");
        String s = reader.readLine();
        if (s.equals("Y")) amigoOutputStream.close();
    }
}

