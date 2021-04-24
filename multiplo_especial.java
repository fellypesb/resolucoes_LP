/******************************************************************************
Resolução da questão: Multiplo especial

Atividade de Laboratório de Programação

Prof. Enoque Calvino Melo Alves

Autores: Fellype Siqueira Barroso
         Davi Lima Rodrigues
         Almiriane Goulart

Universidade Federal do Oeste do Pará - UFOPA
----------------------------------------------------
Formato de entrada

A primeira linha contém um inteiro T (1 <= T <= 10^4) que indica o número de casos de teste.
Seguem T linhas, cada linha contém o inteiro N (1 <= N <= 500) para o qual a solução deve ser
encontrada.

Formato de saída

Imprima a resposta X correspondente a cada caso de teste. A saída não deve conter zeros à
esquerda.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		int t = read.nextInt();
		int n;
		
		int result[] = new int[t];
		
		for(int i=0; i < t; i++){
		    n = read.nextInt();
		    result[i] = multiplex(n);
		}
		
		
		for(Integer results:result){
		    System.out.println(results);
		}
		
		
	}
	
	public static int multiplex(int n){
	    String decomp="";
		
		int digit = 0;
		int cont = 0;
		int m = 0;
		
		for(int i=1; i<1300; i++){
		    m = n * i;
		    decomp = String.valueOf(m);
		    
		    for(int j=0; j < decomp.length(); j++){
		        digit = Integer.valueOf(decomp.substring(j,j+1));
		        if(digit != 0 && digit != 9){
		            break;
		        }else{
		            cont++;
		            
		        }
		    }
		    
		    if(cont == decomp.length()){
		        break;
		    }
		    
		    cont=0;
		}
		
		return m;
	    
	}
}


