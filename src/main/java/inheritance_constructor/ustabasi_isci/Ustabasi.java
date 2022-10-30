package inheritance_constructor.ustabasi_isci;

public class Ustabasi extends Isci{

    String sorumluOlduguBirim;

    int sorumluOlduguIsciSayisi;

    public static void main(String[] args) {

       Ustabasi usb1 = new Ustabasi();

       usb1.sorumluOlduguBirim = "Depo";
       usb1.bolum = "Lojistik";
       usb1.isim = "Fevzi";

       Isci usb2 = new Ustabasi();

        usb2.bolum = "SatinaAlma";
        usb2.soyIsim = "Han";
        usb2.isBasiYili = 2020;



        Personel usb3 = new Ustabasi();

        usb3.statu = "Isci";
        usb3.isim = "Nail";



     //Istedgimiz sekilde output alabiliriz.

        System.out.println(usb1.isim + " : "+ usb1.bolum);
        System.out.println(usb2.isBasiYili + " : "+ usb2.bolum);
        System.out.println(usb3.isim + " : "+ usb3.statu);
    }
}
