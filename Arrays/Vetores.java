import java.util.Scanner;
class Vetores{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        double[] arr = new double[in.nextInt()];
        for(int i = 0;i<arr.length;i++) arr[i] = in.nextDouble();
        for(int i = 0;i<arr.length;i++) System.out.printf("%.2f%n", arr[i]);
        in.close();
    }
}