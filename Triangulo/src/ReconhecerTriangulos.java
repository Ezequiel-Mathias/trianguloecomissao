import java.util.Scanner;
public class ReconhecerTriangulos {

	public static void main(String[] args) {
	
		int t1,t2,t3;
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println(" 1 medida de um tri�ngulo");
		t1 = leitor.nextInt();
		System.out.println(" 2 medida de um tri�ngulo");
		t2 = leitor.nextInt();
		System.out.println(" 3 medida de um tri�ngulo");
		t3 = leitor.nextInt();
		
		
		if (t2 + t1 > t3 && t3 + t2 > t1 && t3 + t1 > t2 ) {
			
			if ( t1 == t2 && t2 == t3 && t3 == t1) {
				System.out.println("EQUIL�TERO");
				
			}else if(t1 != t2 && t2 != t3 && t3 != t1) {
				System.out.println("ESCALENO");
			}else {
				System.out.println("ISOSELES");
			}
		
		}else {
			System.out.println("isso n�o � um triangulo ");
		}

	} 

	}


