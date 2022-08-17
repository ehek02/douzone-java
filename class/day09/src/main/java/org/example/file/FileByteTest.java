package org.example.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileByteTest {
    public void fileRead() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/Users/jonghyun/Desktop/git/ehek02/project/douzone-java/class/day09/src/main/resources/test.txt");
            int value = 0;
            while ((value = fis.read()) != -1) {
                System.out.println(value);
                System.out.println((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void fileSave() {

    }
}
