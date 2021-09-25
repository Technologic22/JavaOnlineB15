package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

public class Clothes implements Wearable {

    int size;

    public static void main(String[] args) {

        //try out all the polymorphic assignment
        //according to these relationship

      Clothes c1 = new Clothes();
      Wearable w1=new Clothes();
      Object o1 = new Clothes();
      //------------------
        Watch wa = new Watch();
        Wearable w2 = new Watch();
        Object o2 = new Watch();
      //-------------------------
        Perfume p1 = new Perfume();
        Wearable w3 = new Perfume();
        Cosmetics c2 = new Perfume();
        Object o3 = new Perfume();
        //------------------------------
        MakeUps m1 = new MakeUps();
        Wearable m2 = new MakeUps();
        Cosmetics m3 = new MakeUps();
        Object o4 = new MakeUps();


    }

    @Override
    public void wear() {
        System.out.println("Wearing my Clothes");

    }
}

class Watch implements Wearable {

    @Override
    public void wear() {
        System.out.println("Wearing my Watch");
    }
}

class Perfume implements Wearable, Cosmetics {

    @Override
    public void wear() {
        System.out.println("Wearing my Perfume");
    }
}

class MakeUps implements Wearable, Cosmetics {

    @Override
    public void wear() {
        System.out.println("Wearing my Makeup");
    }
}