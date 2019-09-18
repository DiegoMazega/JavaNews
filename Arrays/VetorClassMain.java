import java.util.Scanner;
class VetorClassMain{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        VetorClass[] vector = new VetorClass[in.nextInt()];
    
        for(int i = 0; i < vector.length; i++){
            in.nextLine();
            System.out.println("Digite o Nome do produto, aperte ENTER, então digite o valor");
            vector[i] = new VetorClass(in.nextLine(), in.nextDouble());
        }
        for(int i = 0; i < vector.length; i++){
            System.out.printf("%s%n", vector[i]);
        }
    }
}