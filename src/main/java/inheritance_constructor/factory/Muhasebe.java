package inheritance_constructor.factory;

public class Muhasebe extends Personel{

    public int saatUcreti;
    public int maas;
    public String statu;


    public int maasHesapla(){

        int maas = saatUcreti*8*30;

        return maas;
    }












}
