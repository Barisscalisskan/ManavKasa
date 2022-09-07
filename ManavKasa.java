import java.util.Scanner;

public class CokluDersCalisma {

public static void main(String[] args) {

Scanner bar = new Scanner(System.in);


double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        
double bir, iki, uc, dort, bes, tutar;

System.out.print("Armut Kaç Kilo :");

bir = bar.nextDouble();

double sonuc1 = bir * armut;

System.out.println("Elma Kaç Kilo :");

iki = bar.nextDouble();

double sonuc2 = iki * elma;

System.out.println("Domates Kaç Kilo :");
        
uc = bar.nextDouble();

double sonuc3 = uc * domates;

System.out.println("Muz Kaç Kilo :");

dort = bar.nextDouble();

double sonuc4 = dort * muz;

System.out.print("Patlican Kaç Kilo :");

bes = bar.nextDouble();

double sonuc5 = bes * patlican;

tutar = sonuc1 +sonuc2 + sonuc3 + sonuc4 + sonuc5;

System.out.println("Toplam Tutar :" + tutar);
    
    }
}
        
        Patika Sayfası
[PATİKA](https://www.patika.dev.tr)
