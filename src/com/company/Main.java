package com.company;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double y,log1,as,c;

        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite x: ");
        double x = in.nextDouble();
        as = asin((sin(pow(sqrt(abs(x)), 1/3))) / (pow(sin(pow(sqrt(abs(x)), 1/3)), 2) + 7));
        log1 = pow(log(pow(2,sin(2*x +1))+2) / (log(3)),8);

        c = as + log1;

        y = sqrt(abs(c));
        System.out.println(y);

        if (((y >= 0) & (y <= 1)) & ((x >= -1) & (x <= 1))) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
