package inheritance_constructor.Factory;

public class Personel {

    public static int sayac = 1000;
    public int id;
    public String isim;
    public String soyisim;
    public String adres;
    public String telefonNo;


    public int idatama(){

        this.id = sayac;

        sayac++;

        return id;
    }



}
