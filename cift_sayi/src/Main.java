import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        System.out.print("2'ye bölünenler: ");
        for(int i=0; i<=sayi; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.print("3'e bölünenler: ");
        for(int i=0; i<=sayi; i++){
            if(i % 3 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.print("4'e bölünenler: ");
        for(int i=0; i<=sayi; i++){
            if(i % 4 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}