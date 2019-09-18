package tests;
import java.util.Scanner;
class Int{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] split = a.split(" ");
        int teste = Integer.parseInt(a.substring(0, 4));
        int index = a.indexOf("diego");
        int last = a.lastIndexOf("brazuca");
        
        System.out.printf("%d - funciona%n%s%n%d%n%d%n", teste, (a = a.toUpperCase()), index, last);
        
        for(int i=0; i<split.length; i++){
            System.out.printf("%s - ", split[i]);
        }
        
        System.out.printf("%d%n", split.length);
        
        in.close();
    }
}