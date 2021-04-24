/******************************************************************************

Implementação do crivo de Eratóstenes utilizando o collection ArrayList

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
        
        int raiz = (int) Math.floor(Math.sqrt(n));
        
        long time = System.currentTimeMillis();
        crivoArrayList(n, raiz);
        System.out.println("\nTimeRun Arraylist: " + (System.currentTimeMillis() - time));
        
        // imprime lista de primos
        System.out.println(crivoArrayList(n, raiz));
        
	}
	
	public static ArrayList<Integer> crivoArrayList(int n, int raiz) {
		ArrayList<Integer> arraylistPrimo = new ArrayList<Integer>();
		
		// insere todos os valores de 2 a N
		for(int i=2; i<=n; i++) {
			arraylistPrimo.add(i);
		}
                
		// remove os multiplos dos primos da lista
		for(int numTeste=0; numTeste<=arraylistPrimo.size()-1; numTeste++) {
		    
		    	if(arraylistPrimo.get(numTeste) > raiz) break;
           
            		for(int i=0; i<arraylistPrimo.size(); i++) {
                		int x = arraylistPrimo.get(i);
                		int y = arraylistPrimo.get(numTeste);
               			if((x%y==0) && (x!=y)) {
                   		arraylistPrimo.remove(i);
               		 	}
           		}   
            
        	}
		
		return arraylistPrimo;
	}

}
