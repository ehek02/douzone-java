package org.example.file.run;

import org.example.file.FileByteTest;

public class Run {
    public static void main(String[] args) {
        FileByteTest fb = new FileByteTest();
        fb.fileSave();
        fb.fileRead();
    }
}
