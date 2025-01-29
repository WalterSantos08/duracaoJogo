package proGitHub;
import java.util.Scanner;

public class duracaoJogo {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("digite a hora do inicio: ");
		int inicio = dados.nextInt();
		
		System.out.println("digite a hora do fim: ");
		int fim = dados.nextInt();
		
		int duracao;
		
		if (inicio <fim) {
			duracao = fim - inicio;
		}else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("o jogo durou " + duracao + " horas(s).");
		
		dados.close();

	}

}