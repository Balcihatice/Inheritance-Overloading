package inheritance_constructor.factory;

public class Memur extends Muhasebe{

    public static void main(String[] args) {

        //Cinstructor olusturup memurlarimizi olusturalim
       Memur memur1 = new Memur();

       memur1.isim = "Furkan";
       memur1.soyIsim = "Kanat";
       memur1.telefonNo = "5553332211";
       memur1.saatUcreti = 80;

       memur1.maas = memur1.maasHesapla();

       memur1.id = memur1.idatama();



       Memur memur2 = new Memur();

        memur2.isim = "Selami";
        memur2.soyIsim = "Erturk";
        memur2.telefonNo = "5553336677";
        memur2.saatUcreti = 60;

        memur2.maas = memur2.maasHesapla();

        memur2.id = memur2.idatama();


        System.out.println(memur1.id + " : "+ memur1.maas);
        System.out.println(memur2.id + " : "+ memur2.maas);




    }


}
