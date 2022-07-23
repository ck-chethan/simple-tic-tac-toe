package com.chethan;

public class Main {

    public static void main(String[] args) {
        String[][] grid = {{"X ", "O ", "X "}, {"O ", "X ", "O "}, {"X ", "X ", "O "}};
        for(String[] str: grid){
            for(String st: str){
                System.out.print(st);
            }
            System.out.println();
        }
    }
}
