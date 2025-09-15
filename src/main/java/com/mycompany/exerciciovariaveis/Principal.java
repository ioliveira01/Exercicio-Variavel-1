/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciovariaveis;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Você digitou seu nome corretamente.");

        scanner.close();
    }
}