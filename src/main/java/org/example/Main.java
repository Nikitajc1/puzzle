package org.example;

public class Main {
    public static void main(String[] args) {

        String symbol = "@";
        String Space = " ";

        for (int i = 1; i <= 1; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.println(symbol.repeat(k));
            }
            System.out.println();
            System.out.println();
            for (int j = 10; j >= 1; j--) {
                System.out.println(symbol.repeat(j));
            }
            System.out.println();
            System.out.println();
        }

        for (int l = 1; l <= 1; l++) {
            for (int u = 1, b = 10; u <= 10; u++) {
                System.out.println(Space.repeat(b) + symbol.repeat(u));
                b--;
            }
            System.out.println();
            System.out.println();
            for (int minecraft = 1, terraria = 1; minecraft <= 1; minecraft++) {
                for (int t = 10; t >= 1; t--) {
                    System.out.println(Space.repeat(terraria) + symbol.repeat(t));
                    terraria++;
                }
            }
        }
    }
}
