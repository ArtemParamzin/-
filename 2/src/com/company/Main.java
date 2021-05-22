package com.company;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float y = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite x: ");
        float x = in.nextFloat();

        if (x <=2) {
            y = (float) (log(abs(pow(abs(x - 4), x) + pow(2, pow(sqrt(abs(x)), 1 / 4)))) / log(5));
        }

        else if ((x > 2) & (x <8 )) {
            y = (float) sqrt(x / 1 + pow(x,2));
        }

        else if (x >= 8) {
            pow(asin(x/(pow(x,3)+1)),5);
        }

        else {
            System.out.println("Error!");
        }

        System.out.println(y);
    }
}
