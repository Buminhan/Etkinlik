import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        double sicaklik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz.");
        sicaklik = inp.nextDouble();
        if(sicaklik < 5){
            System.out.println("Etkinlik önerimiz : Kayak");
        }
        else if(sicaklik >= 5 && sicaklik <=25){
            if(sicaklik < 10){
                System.out.println("Etkinlik önerimiz : Sinema");
            }
            else if(sicaklik >= 10 && sicaklik <= 15){
                System.out.println("Etkinlik önerilerimiz : Sinema ve piknik");
            }
            else{
                System.out.println("Etkinlik önerimiz : Piknik");
            }
        }
        else{
            System.out.println("Etkinlik önerimiz : Yüzme");
        }
    }
}