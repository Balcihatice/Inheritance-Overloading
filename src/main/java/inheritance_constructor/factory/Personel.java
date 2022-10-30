package inheritance_constructor.factory;

public class Personel {

    public static int sayac = 1000;
    public int id;
    public String isim;
    public String soyIsim;
    public String adres;
    public String telefonNo;


    public int idatama(){

        this.id = sayac;

        sayac++;

        return id;
    }



}
