/******************************************************************************

Resolução da questão: Duro de matar

Atividade de Laboratório de Programação

Prof. Enoque Calvino Melo Alves

Autores: Fellype Siqueira Barroso
         Davi Lima Rodrigues
         Almiriane Goulart

Universidade Federal do Oeste do Pará - UFOPA
----------------------------------------------------


Formato de entrada

A primeira linha contém o número de casos de testes (T). Cada T linha contém 3 inteiros
separados por espaço A, B e C. A e B indicam a capacidade dos dois jarros respectivamente, e C
denota a capacidade exata com a qual um dos jarros deve ser preenchido.

Formato de saída

Para cada caso de teste, imprima "SIM" (em uma nova linha) se um dos jarros puder ser
preenchido com exatamente C litros de água e "NÃO" (em uma nova linha) se eles não
puderem ser preenchidos.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    
	    int n_test = read.nextInt();            // Número de casos de teste
	    int abc[] = new int[3];                 // Vetor que armazena capacidade de água
	    String result[] = new String[n_test];   // Vetor de resultados

	    for(int i=0; i < n_test; i++){
	        abc[0] = read.nextInt();
	        abc[1] = read.nextInt();
	        abc[2] = read.nextInt();
	        result[i] = fillJug(abc);           // Cada index armazena um resultado de caso teste
	    }
	    
	    for(String results : result){
	        System.out.println(results);        // Imprime o vetor de resultados
	    }
	    
	}
	  
	public static String fillJug(int[] abc){
	    int a = abc[0];                  // Jarro A
	    int b = abc[1];                  // Jarro B
	    int c = abc[2];                  // Litros de água desejado
	    
	    int cont = 0;                    // Contador de loops, utilizado para interromper o loop
	    int limitLoop = 5;               // Quantidade max. de loops aceitos
	    
	    while(a != c && b != c){
	        a = abc[0];                  // Enche o balde A até o topo
	        a = Math.abs(a - b);         // Passa água de A para B e atualiza A com qtd de litros contidos
	        b = Math.abs(b - a);         // Passa nova quantidade de A para B e atualiza B com qtd de litros faltantes
	        
	        if(cont > limitLoop){
	            return "NÃO";
	        }
	        cont++;
	    }
	    
	    return "SIM";
	    
	}
	   
}











