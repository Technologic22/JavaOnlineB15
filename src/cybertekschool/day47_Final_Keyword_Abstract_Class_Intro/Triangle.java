package cybertekschool.day47_Final_Keyword_Abstract_Class_Intro;

public class Triangle extends Shape{

    int height;
    int base;

    public Triangle(String name, int height, int base) {
        super(name);
        this.base=base;
        this.height=height;
    }

    @Override
    public void calculateArea() {
        int area=height*(base/2);
        System.out.println("area of the triangle is "+area);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                '}';
    }
}
