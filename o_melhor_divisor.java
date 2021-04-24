/******************************************************************************

Resolução da questão: O melhor divisor

Atividade de Laboratório de Programação

Prof. Enoque Calvino Melo Alves

Autores: Fellype Siqueira Barroso
         Davi Lima Rodrigues
         Almiriane Goulart

Universidade Federal do Oeste do Pará - UFOPA

Entrada: Um único inteiro denotando N.
Saída: Inteiro denotando o melhor divisor de N segundo Carla.

*******************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        //System.out.println("Digite um número inteiro positivo: ");
        int n = teclado.nextInt();
        
        ArrayList listaDivisores = encontrarDivisores(n);
        System.out.println(retirarMelhorDivisor(listaDivisores));
        
    }
    
    public static ArrayList<Integer> encontrarDivisores(int n){
        ArrayList listaDivisores = new ArrayList();
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                listaDivisores.add(i);
            }
        }
        return listaDivisores;
    }
    
    public static int retirarMelhorDivisor(ArrayList<Integer> lista){
        int melhorDivisor = 0;
        int soma = 0;
        int maiorSoma = 0;
        for(int i=0;i<lista.size();i++){
            String s = lista.get(i).toString();
            for(int j=0;j<s.length();j++){
                soma += Integer.valueOf(s.substring(j, j+1));
            }
            
            if(soma > maiorSoma){
                maiorSoma = soma;
                melhorDivisor = lista.get(i);
            }
            else if(lista.get(i) == maiorSoma){
                if(lista.get(i) < maiorSoma){
                    melhorDivisor = lista.get(i);
                } else {
                    melhorDivisor = maiorSoma;
                }
            }
            soma = 0;
        }
        return melhorDivisor;
    }
}


