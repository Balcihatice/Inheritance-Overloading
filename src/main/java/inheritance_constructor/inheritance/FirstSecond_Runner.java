package inheritance_constructor.inheritance;

public class FirstSecond_Runner {

  // First ve Second Class`larinda islem yapmak icin Constructor olusturalim

    public static void main(String args[]) {

        Second obj2 = new Second();
        obj2.i = 1;
        obj2.j = 2;
        First k = obj2;//(k) a clasinda yeni variable
        k.deger();


        Second obj3 = new Second();
        obj3.i = 3;
        obj3.j = 4;
        First d = obj3;
        // System.out.println(d.j); hata verir j`e ulasamaz


        Second obj4 = new Second();
        obj4.i = 5;
        obj4.j = 6;
        First x = obj4;
        System.out.println(x.i);

    }
}