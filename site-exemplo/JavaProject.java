package javaproject;
import java.util.*;
public class JavaProject {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
       double conta = leia.nextDouble();
       if (conta<=500.00){
           conta = conta * 80 * 0.03;
       }
       else{
           conta = conta * 0.25;
       }
        System.out.println("Minha conta de Agua desse mes sera: " + conta);
    }
    
}


