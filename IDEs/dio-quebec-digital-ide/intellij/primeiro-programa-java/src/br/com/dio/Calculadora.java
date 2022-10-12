package br.com.dio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a;
        float b;
        System.out.println("Entre o primeiro valor: ");
        a = input.nextFloat();
        System.out.println("Entre o segundo valor: ");
        b = input.nextFloat();

        float soma = soma(a, b);
        float subtracao = subtracao(a, b);
        float multiplicacao = multiplicacao(a, b);
        float divisao = divisao(a, b);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }

    public static float soma(float a, float b) {
        return a + b;
    }

    public static float subtracao(float a, float b) {
        return a - b;
    }

    public static float multiplicacao(float a, float b) {
        return a * b;
    }

    public static float divisao(float a, float b) {
        return a / b;
    }
}
