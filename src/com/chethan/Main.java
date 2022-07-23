package com.chethan;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        printGameGrid(str);
        findWinner(str);
    }

    public static void printGameGrid(String str) {
        System.out.println("---------");
        for(int i=0; i<str.length(); i++) {
            System.out.printf("| "+str.charAt(i++)+" "+str.charAt(i++)+" "+str.charAt(i)+" "+"| %n");
        }
        System.out.println("---------");
    }

    public static void findWinner(String str) {
        int xc = 0, oc = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'X') {
                xc += 1;
            }
            if (str.charAt(i) == 'O') {
                oc += 1;
            }
        }
        if(xc > 1+oc || oc > 1+xc) {
            System.out.println("Impossible");
            return;
        }
        else if (xc >= 3 || oc >= 3) {
            boolean xwin = false, owin = false;
            if ((str.charAt(0)!='_') && (str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(2)) || (str.charAt(0) == str.charAt(3) && str.charAt(0) == str.charAt(6)) || (str.charAt(0) == str.charAt(4) && str.charAt(0) == str.charAt(8))) {
                if (str.charAt(0) == 'O') {
                    owin = true;
                }
                else if (str.charAt(0) == 'X') {
                    xwin = true;
                }
            }
            if (str.charAt(1)!='_' && str.charAt(1) == str.charAt(4) && str.charAt(1) == str.charAt(7)) {
                if (str.charAt(1) == 'O') {
                    owin = true;
                }
                else if (str.charAt(1) == 'X') {
                    xwin = true;
                }
            }
            if ((str.charAt(2)!='_') &&(str.charAt(2) == str.charAt(5) && str.charAt(2) == str.charAt(8)) || (str.charAt(2) == str.charAt(4) && str.charAt(2) == str.charAt(6))) {
                if (str.charAt(2) == 'O') {
                    owin = true;
                }
                else if (str.charAt(2) == 'X') {
                    xwin = true;
                }
            }
            if ((str.charAt(3)!='_') && str.charAt(3) == str.charAt(4) && str.charAt(3) == str.charAt(5)) {
                if (str.charAt(3) == 'O') {
                    owin = true;
                }
                else if (str.charAt(3) == 'X') {
                    xwin = true;
                }
            }
            if ((str.charAt(0)!='_') && str.charAt(6) == str.charAt(7) && str.charAt(6) == str.charAt(8)) {
                if (str.charAt(6) == 'O') {
                    owin = true;
                }
                else if (str.charAt(6) == 'X') {
                    xwin = true;
                }
            }
            if (xwin && owin) {
                System.out.println("Impossible");
                return;
            }
            else if (xwin) {
                System.out.println("X wins");
                return;
            } else if (owin) {
                System.out.println("O wins");
                return;
            }
        }

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '_') {
                System.out.println("Game not finished");
                return;
            }
        }
        System.out.println("Draw");
    }
}
