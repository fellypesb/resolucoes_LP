/******************************************************************************

Resolução da questão: Fatores primos de Leonardo

Atividade de Laboratório de Programação

Prof. Enoque Calvino Melo Alves

Autores: Fellype Siqueira Barroso
         Davi Lima Rodrigues
         Almiriane Goulart

Universidade Federal do Oeste do Pará - UFOPA
----------------------------------------------------
Formato de entrada

A primeira linha contém um inteiro Q denotando o número de consultas.
Cada uma das linhas subsequentes contém um único inteiro N, a ser consultado.

Formato de saída

Para cada consulta, imprima o número máximo de fatores primos exclusivos para qualquer
número no intervalo inclusivo [1, N] em uma nova linha.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int consult = read.nextInt();               // Numero de consultas
		int results[] = new int[consult];           // Vetor que armazena o resultado de cada consulta
		
		for(int i=0; i<consult; i++){
		    long value = read.nextLong();
		    results[i] = calculateFactors(value);   // Cada index armazena um resultado de consulta
		}
		
		for(int result:results){
		    System.out.println(result);             // Imprime todos os resultados
		}
		

	}
	
	public static int calculateFactors(long value){
	    
	    ArrayList<Integer> arrayPrimes = new ArrayList<Integer>(); // Array que armazena os fatores primos
		
		
		arrayPrimes.add(2);                              // Array é sempre inicialiazado com primo 2 idependente do valor de entrada
		
		long product = 2;                                // Variável que calcula o produto dos fatores primos
		
		for(int i=3; i <= value; i++){
		   int cont=0;                                   // Contador de multiplos
		   
		   for(int j=0; j < arrayPrimes.size(); j++){
		       if(i % arrayPrimes.get(j) == 0){          // Verifica multiplos dos primos
		            break;
		       }else{
		           cont++;
		       } 
		      
		   }
		   
		   if( cont == arrayPrimes.size()){
		       if(product * i > value){                  // Verifica o produtorio dos primos entre [1,N]
		           break;
		       }else{
		           product *= i;
		       }
		       arrayPrimes.add(i);
		   }
		}
		
		// If necessário por conta da necessidade de inicializar array de primos com 2
		if(value == 1) return 0; else return arrayPrimes.size();
	    
	}
}










