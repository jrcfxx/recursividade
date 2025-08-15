package com.mycompany.recursividade;

import java.util.Scanner;

public class RecursividadeClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n============================================");
            System.out.println("\nSelecione a opcao desejada:\n");
            System.out.println("1. Metodo recursivo 1: Criar um método recursivo que multiplique com seu antecessor até chegar em 1 e exiba no console o valor da multiplicação.");
            System.out.println("2. Metodo recursivo 2: Criar um método recursivo que receba um vetor com N números inteiros e que ao final some todos e veja se é um numero par ou impar.");
            System.out.println("3. Metodo recursivo 3: Implemente um função recursiva para inverter uma string. Se o tamanho do texto for 0 ou 1, retorne ela mesma, caso contrário retorne o texto invertido.");
            System.out.println("4. Metodo recursivo 4: Desenvolva uma função recursiva que conte quantas vezes um determinado dígito aparece em um número inteiro N.");
            System.out.println("5. Metodo recursivo 5: Encontrar a posicao de um numero em um vetor");
            System.out.println("6. Sair");
            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu o método recursivo 1: multiplica número com seu antecessor até chegar em 1 e exibe no console o valor da multiplicação");
                    System.out.println("Digite um número inteiro: ");
                    int numEscolhido = scanner.nextInt();
                    int valorFinal = multiplicaAntecessor(numEscolhido);

                    System.out.println("O valor final é: " + valorFinal);
                    break;
                case 2:
                    System.out.println("Você escolheu o método recursivo 2: ");
                    System.out.println("Digite o tamanho do seu vetor: ");
                    int tamEscolhido = scanner.nextInt();
                    int[] vetUsuario = new int[tamEscolhido];
                    for (int i = 0; i < tamEscolhido; i++) {
                        System.out.println("Dgite o valor: " + (i + 1));
                        vetUsuario[i] = scanner.nextInt();
                    }
                    ;

                    System.out.println("Resultado do metodo recursivo 2: " + somaVetorRecursivo(vetUsuario, tamEscolhido));
                    break;
                case 3:
                    System.out.println("Você escolheu o método recursivo 3");
                    System.out.println("Leia do teclado as informações necessárias");
                    System.out.println("Chame o método recursivo e apresente o resultado:");
                    System.out.println("Resultado do metodo recursivo 3: " + metodo3());
                    break;
                case 5:
                    System.out.print("Digite o tamanho do vetor: ");
                    int n = scanner.nextInt();
                    int[] vet = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vet[i] = scanner.nextInt();
                    }
                    System.out.print("Digite o numero a ser encontrado: ");
                    int x = scanner.nextInt();
                    System.out.println("Numero " + x + " -> posicao: " + encontrar(vet, n, x));
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    // Criar um método recursivo que multiplique com seu antecessor até chegar em 1 e exiba no console o valor da multiplicação.
    public static int multiplicaAntecessor(int n) {
        if (n == 1) {
            return 1;
        } else {
            n *= multiplicaAntecessor(n - 1);
            return n;
        }
    }

    // Criar um método recursivo que receba um vetor com N números inteiros e que ao final some todos.
    public static int somaVetorRecursivo(int[] vet, int tamanho) {
        int t = tamanho - 1;
        if (t == 0) {
            return vet[0];
        }
        int soma = vet[t] + somaVetorRecursivo(vet, t - 1);
        return soma;
    }

    public static String metodo3() {
        return "resultado 3";
    }

    public static int encontrar(int[] A, int n, int x) {
        int pos = -1;
        if (n > 0) {
            if (A[n - 1] == x) {
                pos = n - 1;
            } else {
                pos = encontrar(A, n - 1, x);
            }
        }
        return pos;
    }

}
