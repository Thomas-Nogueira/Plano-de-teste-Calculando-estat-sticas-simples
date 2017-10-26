
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class CalculandoEstatisticaSimples {
    
    int array[] = new int[3];
    Scanner sc = new Scanner (System.in);
    float soma;
    
    public int minimo(int min){
        for(int i = 0; i < array.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            array[i] = sc.nextInt();
		if(array[i] > min){ 
                    min = array[i];
                }
        }
        return min;
    }
    
    public int maximo(int max){
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            array[i] = sc.nextInt();
		if(array[i] > max){ 
                    max = array[i];
                }
        }
        return max;
    }
    
    public int tamanho(int tam){
        
        tam = array.length;
        return tam;
    }
    
    public float media(float media){
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            array[i] = sc.nextInt();
            soma += array[i];
        }
        return media = soma / 2;
    }
    
}
