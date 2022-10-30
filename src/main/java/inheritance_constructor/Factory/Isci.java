package inheritance_constructor.Factory;

public class Isci extends Muhasebe {

    public static void main(String[] args) {

        //Birinci iscimizi olusturalim

        Isci isci1 = new Isci();

        isci1.isim = "Huseyin";
        isci1.soyisim = "Kilic";
        isci1.telefonNo = "5559994422";
        isci1.saatUcreti = 30;

        isci1.maas = isci1.maasHesapla();
        isci1.id = isci1.idatama();


    // Ikinci iscimizi olusturalim

        Isci isci2 = new Isci();

        isci2.isim = "Aysenaz";
        isci2.soyisim = "Hosgor";
        isci2.telefonNo = "5558884422";
        isci2.saatUcreti = 35;

        isci2.maas = isci2.maasHesapla();
        isci2.id = isci2.idatama();


        System.out.println(isci1.id + " : "+ isci1.maas);
        System.out.println(isci2.id + " : "+ isci2.maas);


    }
}
