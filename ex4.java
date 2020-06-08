import java.util.Scanner;
public class ex4 {

	public static void main(String[]args) {	
	int a;
	int b;
	int teste;	
		Scanner leitor= new Scanner(System.in);
		
		System.out.println("Escreva dois números");
		
		System.out.println("Escreva 1°");
		a= leitor.nextInt();
		System.out.println("Escreva 2°");
		b= leitor.nextInt();
		exibcod();
		
		teste = leitor.nextInt();
		
		switch(teste) {
		case 1 : 
			System.out.println("A soma de "+a+" + "+b+"é igual a "+ a+b);
			break;
		case 2 : 
			System.out.println("A Subtração de "+a+" - "+b+"é igual a "+(a-b) );
			break;
		case 3 : 
			System.out.println("A Multiplicação de "+a+" x "+b+"é igual a "+ a*b);
			break;
		case 4 : 
			System.out.println("A Divisão de "+a+" / "+b+"é igual a "+ a/b);
			break;
			
		}
		
	}	
		
		
	
	 public static void exibcod() {
		 
		 
		 System.out.println("Selecione a opção para a operação a ser realizada");
			
			System.out.println("-------------------------");
			System.out.println("Adição (1)");
			System.out.println("Subitração(2)");
			System.out.println("Multiplicação (3)");
			System.out.println("Divisão(4)");
			System.out.println("-------------------------");
			
		
		 
		
	
	}
}
