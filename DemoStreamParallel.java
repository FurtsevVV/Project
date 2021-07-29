package com.company;

import javafx.print.Collation;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class DemoStreamParallel {


    public static void main(String[] args) throws IOException {

Stream.iterate(10, x -> x + 2).limit(5).forEach(System.out::println);

        }

    }

