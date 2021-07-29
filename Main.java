package com.company;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
            public static void main(String[] args) throws IOException {
                String path  = "C:/Users/Zakat/AdvancedJava/src/com/company/resourses/hello.txt";
byte [] bytes = Files.readAllBytes(Paths.get(path));
String contents = new String(bytes, StandardCharsets.UTF_8);
String [] words = contents.split("\\PL+");
int count = 0;
for (String w: words) {
    if (w.length() > 6) {
        count++;
    }
}

                System.out.println(count);

    }

    }








