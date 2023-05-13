import java.util.Scanner;

public class AlanHesapla {
    public static void main(String[] args) {

       double a, b, c;

        Scanner input =new Scanner(System.in);

        System.out.print(" ilk kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print(" ikinci kenarı giriniz: ");
       b = input.nextDouble();

        System.out.print(" üçüncü kenarı giriniz: ");
       c = input.nextDouble();

       double ucgeninCevresi = a + b + c;

       double u = ucgeninCevresi/2;

       double alan_kare = u * (u-a) * (u-b) * (u-c);

       double alan = Math.sqrt(alan_kare);

        System.out.print(alan);



    }
}