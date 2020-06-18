package cybertekschool.day48_AbstractClass_Interface;

//--a class can implement more than one interface
public class Kangaroo implements Bouncible, BoxerWithBellyPouch{
    int jumpDistance;
    String name;

    public Kangaroo(String name, int jumpDistance){
        this.name=name;
        this.jumpDistance=jumpDistance;
    }

    //--these 2 methods are coming from BoxerWithBellyPouch interface!!!
    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name "+name+" is kickboxing");
    }

    @Override
    public void carryChildInThePouch() {
        System.out.println(" Kangaroo "+name+" is carrying child in her pouch");
    }

    public void eat(){
        System.out.println("Kangaroo with name "+name+ " is eating Grass..");
    }

    //--these methods are inherited from Bouncible interface
    @Override
    public void bounce() {
        System.out.println("this "+name+ " can jump "+jumpDistance+ " meters forward under "+GRAVITY+" gravity force");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "jumpDistance=" + jumpDistance +
                ", name='" + name + '\'' +
                '}';
    }


}
