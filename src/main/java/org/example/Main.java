package org.example;

public class Main {
    public static void main(String[] args) {

        int number = 1;
        String symbol = "@";
        String Space = " ";
        int space = 10;

        for (int i = 1; i <=1; i++) {
            for (int k = 1; k <=10; k++) {
                System.out.println(symbol.repeat(number));
                number++;
            }
            System.out.println();
            number--;
            System.out.println();
            for (int j = 1; j <=10; j++) {
                System.out.println(symbol.repeat(number));
                number--;
            }
            System.out.println();
            System.out.println();
            for (int l = 1; l<=1; l++) {
                for (int u = 1; u <= 10; u++) {
                    System.out.println(Space.repeat(space) + symbol.repeat(number));
                    number++;
                    space--;
                }
            }
            System.out.println();
            number--;
            space++;
            System.out.println();
            for(int minecraft = 1; minecraft <=1; minecraft++) {
                for (int t = 1; t <= 10; t++) {
                    System.out.println(Space.repeat(space) + symbol.repeat(number));
                    number--;
                    space++;
                }
            }
        }
    }
}