package jogo__adivinha;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Vamos jogar um jogo");
		System.out.println("");
		
		Random gerador = new Random();
		int x = gerador.nextInt(100);
		
		System.out.println("Adivinhe no que estou pensando");
		
		Scanner entrada = new Scanner(System.in);
		
		int resultado = entrada.nextInt();
		
		
		if (resultado == x) {
			System.out.println("Voce acertou, numero que pensei foi: " + x);
		}
		else {
			System.out.println("Voce errou, pensei no numero: " + x);
		}
		
	}

}
