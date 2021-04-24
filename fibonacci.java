/******************************************************************************

Resolução da questão: Fibonacci

Atividade de Laboratório de Programação

Prof. Enoque Calvino Melo Alves

Autores: Fellype Siqueira Barroso
         Davi Lima Rodrigues
         Almiriane Goulart

Universidade Federal do Oeste do Pará - UFOPA
----------------------------------------------------
Formato de entrada:

A primeira linha contém um único inteiro T (o número de testes). Seguem T linhas, cada uma
contendo três inteiros: A, B, e N.

Formato de saída:

Para cada caso de teste, imprima um único inteiro representando F_n.

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
	    
	    int fibo[] = new int[n+1];
		
		fibo[0] = a;
		fibo[1] = b;
		
        
		for(int i=2; i <= n; i++){
		    fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		return fibo[n];
	    
	}
}



