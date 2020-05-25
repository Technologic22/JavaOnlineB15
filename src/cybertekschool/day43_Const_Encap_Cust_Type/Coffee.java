package cybertekschool.day43_Const_Encap_Cust_Type;

/**
 * A Blueprint for Coffee object
 * With 3 constructors
 * getters and setters
 * Price should never be less than 0
 * No Coffee object with minus price should be created
 * No one should change the price
 * to minus for any existing coffee object
 */


public class Coffee {
    private String type;
    private int caffeineLevel;
    private double price;

    public Coffee(){
        System.out.println(" Constructor with no parameter");
    }
    public Coffee(String type, int caffeineLevel) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
    }

    public Coffee(String type) {
    this.type=type;
    }

    public Coffee(String type, int caffeineLevel, double price ) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;

        // only set the value if the price is valid
//        if (price > 0) {
//            this.price = price;
//        } else {
//            this.price = 1;
//        }
        // we already have a code to do above logic in setter
        // so we can call the method directly to avoid duplication
        // you can call any methods of same class in constructors
        setPrice(price);

    }

    //we want to block the caller of this method
    //to set invalid value, less than 0
    //price is automatically corrected to 1

    public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                this.price = 1;
            }
        }



    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public int getCaffeineLevel() {

        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {

        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {

        return price;
    }

       @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }

}
