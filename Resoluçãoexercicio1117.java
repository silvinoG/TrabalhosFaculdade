import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner (System.in);
    
    double t = 0;
    double x = 0;
    double m = 0;
    double s = 0;
    
    while(s != 2){
    x = sc.nextDouble();
    
    if((x >= 0.0) && (x <= 10.0)){
        t = t + x;
        s = s + 1;
    }else
        System.out.println("nota invalida");
    }
    m =(double) t / 2;
    System.out.printf("media = %.2f\n",m);
    }
}
