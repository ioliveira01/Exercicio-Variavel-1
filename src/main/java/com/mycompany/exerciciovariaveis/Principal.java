/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciovariaveis;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criar o objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o nome ao usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Mostrar a mensagem com o nome digitado
        System.out.println("Olá, " + nome + "! Você digitou seu nome corretamente.");

        // Fechar o scanner
        scanner.close();
    }
}