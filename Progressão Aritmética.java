import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    
    int vetor[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    int soma = 0;
    
    Scanner sc = new Scanner(System.in);
    
    for(int i=0; i<vetor.length; i++){
        soma = soma + vetor[i];
    }
    
    System.out.println("A soma da progressao e: " + soma);   
        
    }    
}
