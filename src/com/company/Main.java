package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int suma;
        int produs;
        int difer;
        int imp;
        Scanner input = new Scanner(System.in);
        System.out.printf("Introduceti primul numar intreg: ");
        a = input.nextInt();
        System.out.print("Introduceti al doilea numar intreg: ");
        b= input.nextInt();
        suma = a+b;
        System.out.printf("Suma = %d%n", suma);
        produs = a*b;
        System.out.printf("Produsul = %d%n", produs);
        difer = a-b;
        System.out.printf("Diferenta = %d%n", difer);
        imp = a/b;
        System.out.printf("Impartirea = %d%n", imp);
    }
}