/******************************************************************************

Implementação da questão Fibonacci com recursividade.

Atividade de Laboratório de Programação

Prof. Enoque Calvino Melo Alves

Autores: Fellype Siqueira Barroso
         Davi Lima Rodrigues
         Almiriane Goulart

Universidade Federal do Oeste do Pará - UFOPA

*******************************************************************************/
import java.util.*;


public class Main
{
    
	public static void main(String[] args) {
	    
	    Scanner read = new Scanner(System.in);
	    
	    int t, a, b, n, result[];
		
	    t = read.nextInt();
		
	    result = new int[t];
		
		
		for(int i=0; i < t; i++){
		    a = read.nextInt();
		    b = read.nextInt();
		    n = read.nextInt();
		    result[i] = fibonacci(a, b, n);
		}
		
		for(int results:result){
		    System.out.println(results);
		}
		
		
	}
	
	public static int fibonacci(int a, int b, int n){
	    
	    if(n == 2){
	        return a + b;
	    }else if(n == 1){
	        return b;
	    }else{
	        return fibonacci(a, b, n-1) + fibonacci(a, b, n-2);
	    }
	    
	}
}



