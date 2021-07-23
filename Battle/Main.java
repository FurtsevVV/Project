package com.company.Battle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
        int infantry = random.nextInt(110);
        int archers = random.nextInt(90);

            res(infantry, archers);}


    }
    public static void res (int inf, int arch) {
        if (inf >= arch){
            System.out.println("Пехота выиграла");
        } else {
            System.out.println("Лучники выиграли");
        }
    }
}
