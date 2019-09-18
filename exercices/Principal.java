import java.util.Scanner;
class Principal{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int vagas, alugantes;
        Pessoas[] arr;
        
        do{
        System.out.println("Quantos quartos há para aluguel?");
        vagas = in.nextInt();
        arr = new Pessoas[vagas];
        System.out.println("Quantos alugantes há?");
        alugantes = in.nextInt();
        }while(alugantes >= vagas);
        
        for(int i = 1; i<=alugantes;i++){
            int room;
            
            do{
                System.out.println("Qual Quarto irá alugar?");
                room = in.nextInt();
                in.nextLine();
                if(arr[room-1]!=null) System.out.println("Quarto Indiponível no momento");
            }while(arr[room-1]!=null);
            
            System.out.println("Digite o Nome e Email da pessoa, em Linhas Separadas");
            String nome = in.nextLine();
            String email = in.nextLine();
            
            room: for(int j = 0; j<arr.length;j++){
                if(room-1 == j){
                    arr[j] = new Pessoas(nome, email, room);
                    break room;
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != null){
                System.out.printf("%s%n", arr[i]);
            }
        }
    }
}