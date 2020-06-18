package cybertekschool.day48_AbstractClass_Interface;

public class Ball implements Bouncible{

    String shape;
    String color;

    //--public static final double GRAVITY=9.81;

    public Ball(String shape, String color){
        this.shape=shape;
        this.color=color;
    }

    @Override
    public void bounce() {
        System.out.println(color+ " Ball with "+shape+ " shape can bounce when gravity is "+GRAVITY);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
