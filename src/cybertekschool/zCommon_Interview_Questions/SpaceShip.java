package cybertekschool.zCommon_Interview_Questions;

public class SpaceShip {

    String name;
    int x;
    int y;
    String currentDirection;


    public void setInitialPosition(int yCoordinate, int xCoordinate){
        x=xCoordinate;
        y=yCoordinate;
    }

    public void setDirection(String direction){
        currentDirection=direction;
    }

    public void move1Block(){

        switch (currentDirection){
            case "up":
                y+=1;
                break;
            case "down":
                y-=1;
                break;
            case "right":
                x+=1;
                break;
            case "left":
                x-=1;
                break;
            default:
                break;

        }

      }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }
}
