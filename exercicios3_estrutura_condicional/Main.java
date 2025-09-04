package estrutura_condicional_exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a , b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a % b == 0 || b % 2 == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();

	}

}
