import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km , yas , yTip ;
        double indTutar , tutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Mesafe Giriniz : ");
        km = input.nextInt();

        System.out.println("Lutfen Yasinizi Giriniz : ");
        yas = input.nextInt();

        System.out.println("Lutfen Yolculuk Tipi Giriniz : (1 : Gidiş || 2 : Gidis-Donus )");
        yTip = input.nextInt();


        if (yTip == 1) {
            tutar = km*2;
            if (yas <= 12){
                indTutar = tutar/2;
                System.out.println("Biletin tutarı :"+tutar);
                System.out.println("Biletin indirimli tutarı :"+indTutar);
            }
            else if (yas > 12 && yas <=24) {
                indTutar = tutar-tutar/10;
                System.out.println("Biletin tutarı :"+tutar);
                System.out.println("Biletin indirimli tutarı :"+indTutar);
            }
            else if(yas >= 65){
                indTutar = tutar-tutar/15;
                System.out.println("Biletin tutarı :"+tutar);
                System.out.println("Biletin indirimli tutarı :"+indTutar);
            }
            else {
                System.out.println("Biletin tutarı :"+tutar);
            }
        }
        else if(yTip == 2){
            tutar = km*4;
            tutar = tutar-tutar/5;
            if (yas <= 12){
                indTutar = tutar/2;
                System.out.println("Biletin tutarı :"+tutar);
                System.out.println("Biletin indirimli tutarı :"+indTutar);
            }
            else if (yas > 12 && yas <=24) {
                indTutar = tutar-tutar/10;
                System.out.println("Biletin tutarı :"+tutar);
                System.out.println("Biletin indirimli tutarı :"+indTutar);
            }
            else if(yas >= 65){
                indTutar = tutar-tutar/15;
                System.out.println("Biletin tutarı :"+tutar);
                System.out.println("Biletin indirimli tutarı :"+indTutar);
            }
            else {
                System.out.println("Biletin tutarı :"+tutar);
            }
        }
        else {
            System.out.println("Hatalı Giriş Yaptınız! ");

        }
    }
}