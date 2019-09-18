package app;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CalcShop shop = new CalcShop();
        char choise;
        
        System.out.println("Digite o Nome do Produto, Preço e quantidade, por favor siga a ordem");
        shop.setNewProduct(in.nextLine(), in.nextDouble(), in.nextInt());
		do{
            System.out.printf("%nO que Deseja Fazer?%nI - entrada no estoque%nO - saída no estoque%nT - calcular valor total do produto%nG - pegar todas informação atual do pruduto%n");
            choise =  Character.toLowerCase(in.next().charAt(0));

            switch(choise){
                case 'i':
                shop.inAmount(in.nextInt());
                break;
                case 'o':
                shop.outAmount(in.nextInt());
                break;
                case 't':
                System.out.printf("%n%.2f%n", shop.Calc());
                break;
                case 'g':
                System.out.printf("%n%s%n", shop.getProduct());
                break;
                default:
                System.out.println("%nEscolha uma Opção valida");
                break;
            }
        }while(choise != 'q');  
        in.close();
    }
}