package exercicios1_estrutura_condicional_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n1;
		n1 = sc.nextInt();
		if (n1>0) {
			System.out.println("Não negativo");
		}
		else {
			System.out.println("NEGATIVO");
		}
		sc.close();

	}

}
