import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int total3 = 0;
        int total4 = 0;
        int count3 = 0;
        int count4 = 0;
        double avarage;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        System.out.print("2'ye bölünenler: ");
        for(int i=1; i<=sayi; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.print("3'e bölünenler: ");
        for(int i=1; i<=sayi; i++){
            if(i % 3 == 0){
                total3 += i;
                count3++;
                System.out.print(i + ", ");

            }
        }
        System.out.println("");
        System.out.print("4'e bölünenler: ");
        for(int i=1; i<=sayi; i++){
            if(i % 4 == 0){
                total4 += i;
                count4++;
                System.out.print(i + ", ");
            }
        }

        //3 ve 4 e bölünen sayıların ortalaması.
        avarage = (total3 + total4)/(count3+count4);
        System.out.println("");
        System.out.println("3 ve 4 e bölünen sayıların ortalaması: " + avarage);
    }
}