package com.company;

import java.lang.module.ModuleReader;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal :  " );
        int Principal = scanner.nextInt();


        System.out.print("Annual Interest Rate : ");
        float AIR = scanner.nextFloat();


        System.out.print("Period (Years): ");
        int Period = scanner.nextInt();


        float MIR = AIR/(100*12);
        float Mortgage = (float) ((Principal * MIR * Math.pow(1+MIR ,12*30))/((Math.pow(1+MIR ,12*30))-1));
        String formatMortgage = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortage: " + formatMortgage  );

    }
}
