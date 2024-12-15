package JAVA101;

import java.util.Scanner;

public class giris {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("matematik notunuzu girin");
        matematik = input.nextInt();
        System.out.println("fizik notunuzu girin");
        fizik = input.nextInt();
        System.out.println("kimya notunuzu girin");
        kimya = input.nextInt();
        System.out.println("turkce notunuzu girin");
        turkce = input.nextInt();
        System.out.println("tarih notunuzu girin");
        tarih = input.nextInt();
        System.out.println("muzik notunuzu girin");
        muzik = input.nextInt();
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ort = toplam / 6.0;
        String sonuc = ort >= 60 ? "gectiniz" : "kaldiniz";
        System.out.println(sonuc);

    }
}