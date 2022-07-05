package org.example;


public class Main {
    public static void main(String[] args) {
        int suma=0;
        for (int i = 1; i < 1000; i++) {
            suma += i%3==0 || i%5==0?i:0;
        }

    }
}