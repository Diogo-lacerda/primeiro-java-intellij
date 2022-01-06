package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;
        System.out.println("digite o primeiro valor");
        a = ler.nextInt();
        System.out.println("digite os segundo valor");
        b = ler.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("soma: "+ somar);
        System.out.println("subtrair: "+ subtrair);
        System.out.println("multiplica: "+ multiplicar);
        System.out.println("dividir: "+ dividir);

    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static double dividir(int a, int b){
        return a / b;
    }
}
