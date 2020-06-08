import java.util.Scanner;

public class ex1 {
	
	public static void main(String[]args) {	
		
		 
		 
		 Scanner leitor = new Scanner(System.in);
		 
		 int multiplicacao;
		 int num,num2;
		 
		 System.out.printf(" Digite um números inteiros");
		 num= leitor.nextInt();
		 
		 System.out.printf(" Digite outro número inteiros");
		 num2= leitor.nextInt();
		 
		 multiplicacao = num*num2;
		 
		 System.out.printf("O resultado é = "+multiplicacao);
}
}