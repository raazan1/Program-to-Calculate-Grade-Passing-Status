import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> Notlar = new ArrayList <Integer>();

        Scanner input = new Scanner(System.in);
        System.out.printf("Matematik Notunu Giriniz: ");
        int Mat = input.nextInt();

        System.out.printf("Fizik Notunu Giriniz: ");
        int Fiz = input.nextInt();

        System.out.printf("Türkçe Notunu Giriniz: ");
        int Tür = input.nextInt();

        System.out.printf("Kimya Notunu Giriniz: ");
        int Kim = input.nextInt();

        System.out.printf("Müzik Notunu Giriniz: ");
        int Müz = input.nextInt();

        Notlar.add(Mat);
        Notlar.add(Fiz);
        Notlar.add(Tür);
        Notlar.add(Kim);
        Notlar.add(Müz);

        double ort = 0;
        int i = 0;
        int kac = 0;
        for (; i < Notlar.size(); i++) {
            if(Notlar.get(i)>0 && Notlar.get(i)<=100){
                ort = ort + Notlar.get(i);
                kac++;
            }
        }
        System.out.printf(kac + " Dersin"+"\nOrtalaması: " + ort/kac);
        System.out.printf(ort/kac>=55?" ("+  kac+") :Dersin Ortalaması Geçtiniz" : "(" + kac +") :Dersin Ortalaması İle Kladınız");


    }
}