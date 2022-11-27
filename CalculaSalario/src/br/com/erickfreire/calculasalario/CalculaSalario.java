package br.com.erickfreire.calculasalario;

import java.util.Scanner;

public class CalculaSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int horasTrabalhadas;		
		int horasAcrescidas;
		double valorHora;
		double salarioFinal;
		
		System.out.println("Programa que calcula o sal�rio semanal de um funcion�rio: ");
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextInt();
		
		System.out.print("Digite o valor da hora trabalhada: ");
		valorHora = entrada.nextDouble();
		
		if(horasTrabalhadas <= 40) {
			salarioFinal = horasTrabalhadas * valorHora;
		} else {
			horasAcrescidas = horasTrabalhadas % 40;
			
			salarioFinal = (40 * valorHora) + (horasAcrescidas * (valorHora + (valorHora * 0.5)));
		}
		
		System.out.printf("%nO sal�rio da semana do funcion�rio � de: %.2f%n", salarioFinal);

	}

}
