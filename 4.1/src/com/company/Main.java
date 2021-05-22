package com.company;

import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        int kp = 0;
        int ki = 0;
        Scanner in = new Scanner(System.in);// Vvod dannuh
        System.out.print("Vvedite 1 chislo razmera matrici: ");
        int x = in.nextInt();
        System.out.print("Vvedite 2 chislo razmera matrici: ");
        int xx = in.nextInt();
        System.out.print("Vvedite index: ");
        int y = in.nextInt();

        double [][]mas = new double[x][y];//sozdanie massiva

        double max = 20;
        double min = -20;
        Random random = new Random();

        for(i = 0; i < x; i++) {//zapolnenie massiva
            for (int k=0; k<xx;k++){
                mas[i][k] = min +(max - min) * random.nextDouble();
                System.out.print(mas[i][k] + " ");
            }
            System.out.println(" ");
        }

        for(i = 0; i < x; i++) {//Vuvod rezultata
            for (int k=0; k<xx;k++){
                if(mas[i][k]>0){
                    kp++;
                    System.out.println("polojenie polojitelnuh chisel v massive [" + i + "] [" + k + "] Kol-vo etih chisel = "+ kp);
                }
                if (abs(i-k) == y){
                    ki++;
                    System.out.println("polojenie raznosti indexov v massive [" + i + "] [" + k + "] Kol-vo raznosti indexov = " + ki);
                }
            }
        }
    }
}