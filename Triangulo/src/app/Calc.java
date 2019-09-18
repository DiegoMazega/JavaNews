package app;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
        Scanner in =  new Scanner(System.in);
        Triangulo trix = new Triangulo();
        Triangulo triy = new Triangulo();
        
        System.out.printf("Digite o Valor dos lados do triangulo X: %n"); 
        trix.setArea(in.nextDouble(), in.nextDouble(),in.nextDouble());
        System.out.printf("%.4f%n", trix.getArea());
        
        System.out.printf("Digite o Valor dos lados do triangulo Y: %n");
        triy.setArea(in.nextDouble(), in.nextDouble(),in.nextDouble());
        System.out.printf("%.4f%n", triy.getArea());
        
        if(trix.getArea()<triy.getArea())System.out.println("Triangulo Y is the bigger");
        
        else System.out.println("Triangulo X is the bigger");
        
        in.close();
    }
}