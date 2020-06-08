import java.util.Scanner;

public class ex {
	public static void main (String[]arg) {
	Scanner leitor = new Scanner(System.in);
	
	
	int x,y;
	double soma=0;
	
	System.out.println("Digite dois números diferentes em sequencia");
	x=leitor.nextInt();
	y=leitor.nextInt();
	
	if(x<y) {
	do {
		soma=x+soma;
		
				x++;
		
	}while(x<y);
	System.out.println("A soma de todos os numeros inteiros de um a outro é = "+(soma+y));
	}
	
	if(x>y) {
	
	do {
		
		soma=y+soma;
		y++;
		
	}while(y<x);
	System.out.println("A soma de todos os números inteiros de um a outro é = "+(soma+x));
	

	
	
	}
	}	
	
}

