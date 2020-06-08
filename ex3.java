import java.util.Scanner;
public class ex2 {

	
	public static void main(String[]args) {	
		
	
	Scanner leitor= new Scanner(System.in);

float a;	
float b;
float c;
float d;
double x=7.0;	


System.out.println(" Digite um números inteiros");
a= leitor.nextFloat();

System.out.println(" Digite um números inteiros");
b= leitor.nextFloat();

System.out.println(" Digite um números inteiros");
c= leitor.nextFloat();

System.out.println(" Digite um números inteiros");
d= leitor.nextFloat();

        float resultado = media (a,b,c,d);
        System.out.println(resultado);

	
        if(resultado >= x) 
    		System.out.println(" aprovado");
    	
	}
	

public static  float media (float  a, float b, float c,float d) {
	double nota;
	
	nota = ((a+b+c+d)/4);
	
	return (float) nota;
	
	
	
	
	
}

}