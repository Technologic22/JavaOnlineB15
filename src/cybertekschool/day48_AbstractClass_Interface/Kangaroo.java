package cybertekschool.day48_AbstractClass_Interface;

public class Kangaroo implements Bouncible{
    int jumpDistance;
    String name;

    public Kangaroo(String name, int jumpDistance){
        this.name=name;
        this.jumpDistance=jumpDistance;
    }

    public void eat(){
        System.out.println("Kangaroo with name "+name+ " is eating Grass..");
    }

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
