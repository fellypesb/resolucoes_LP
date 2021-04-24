/******************************************************************************

Implementação do crivo de Eratóstenes utilizando o collection Linkedlist

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
		
		int n = read.nextInt();
        
        int raiz = (int) Math.floor(Math.sqrt(n)); // retorna a raiz do valor N
        
        long time = System.currentTimeMillis();
        crivoLinkedlist(n, raiz); 
        System.out.println("\nTimeRun Linkedlist: " + (System.currentTimeMillis() - time));
        
        //Imprime lista de primos
        System.out.println(crivoLinkedlist(n, raiz));
        
	}
	
	public static LinkedList<Integer> crivoLinkedlist(int n, int raiz) {
                
		LinkedList<Integer> linkedListPrimo = new LinkedList<Integer>();
		
		// insere todos valores de 2 a N
		for(int i=2; i<=n; i++) {
			linkedListPrimo.add(i);
		}
                
		// remove os multiplos dos primos da lista
		for(int numTeste=0; numTeste<linkedListPrimo.size(); numTeste++) {
		    
		    if(linkedListPrimo.get(numTeste) > raiz) break;
            
            for(int i=0; i<linkedListPrimo.size(); i++) {
                int x = linkedListPrimo.get(i);
                int y = linkedListPrimo.get(numTeste);
                
               	if((x%y==0) && (x != y)) {
                    linkedListPrimo.remove(i);
                }
            }   
        }
		return linkedListPrimo;
	}
}







