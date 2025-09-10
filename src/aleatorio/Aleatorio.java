
package aleatorio;

import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {
        Random Aleatorio = new Random();
        
        System.out.println("Los numeros aleatorios son:");
        for(int i=0; i<10; i++){
            int N = Aleatorio.nextInt(100);
            int j=0;
            j=i+1;
            System.out.println(j + " = " +N);
        }
    }
    
}
