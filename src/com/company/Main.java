package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class Main {

    public String[] keys = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

    // input format: [old key, new key]
    public static void main(String[] args) {
        File file = new File("/Users/acastro/Dropbox/Worship Resources/10,000 reasons (e).doc");
        File fileFlat = new File("/Users/acastro/Dropbox/Worship Resources/10,000 reasons (e).doc");
        WordExtractor extractor = null;

        String oldKey = args[0];
        String newKey = args[1];
        try {
//            file = new File(args[0]);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] fileData = extractor.getParagraphText();
            for (int i = 0; i < fileData.length; i++) {
                if (fileData[i] != null)
                    System.out.println(fileData[i]);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
