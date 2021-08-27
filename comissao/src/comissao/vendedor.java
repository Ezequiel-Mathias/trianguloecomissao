package comissao;
import java.util.Scanner;
public class vendedor {

	
	public static void main(String[] args) {
		String n;
		double j;
		double t,r,k;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual seu nome ? ");
		n = leitor.next();
		
		System.out.println("quantos tempo você trabalhou ? ");
		t = leitor.nextInt();
		System.out.println("qual o valor total de vendas ? ");
		r = leitor.nextInt();
		j = 500;
		k = 2000;
		if (r >= 10.000 && t >= 1.0) {
			System.out.println("sua comissão será "+ j);
		else if (r >= 20.000 && t >= 1.0);{
				System.out.println("sua comissão séra "+ k );	
		}else if {
				System.out.println("sua comissão será ");
			}
		
			
		
	}

}
