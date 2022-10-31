import java.util.Scanner;

public class Main{
    static void prime(int a, int i) {

        if(a==i){
            System.out.println("Asal sayıdır");
            return;
        } else if(a%i==0){
            System.out.println("Asal sayı değildir");
            return;
        }
        prime(a,i+1);
    }
    public static void main (String[] args){
        int i=1;
        Scanner input= new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int a= input.nextInt();
        prime(a,2);
    }
}
