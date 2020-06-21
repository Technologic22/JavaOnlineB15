package cybertekschool.day49_Interface_Practice;

public interface Chargeable {

    public abstract void chargedDaily();

    public default void isEnvironmentFriendly(){
        boolean isEnvironmentFriendly=true;
        System.out.println(isEnvironmentFriendly);
    }

}
