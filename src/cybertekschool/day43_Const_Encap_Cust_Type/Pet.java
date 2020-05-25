package cybertekschool.day43_Const_Encap_Cust_Type;

public class Pet {
    private String name;
    private String type;

    public Pet(){
        this.name="no-name";
        this.type="unknown";
    }
    public Pet(String name, String type){
        this.name=name;
        this.type=type;
    }

    public void voice(){
        switch (type.toLowerCase()){
            case "cat":
                System.out.println(name+" Meows");
                break;
            case "horse":
                System.out.println(name+": Neinei");
                break;
            case "dog":
                System.out.println(name+" woof Woof");
                break;
            case "cow":
                System.out.println(name+" Moo Moo");
                break;
            default:
                System.out.println("Unknown Animal");
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void showPetInfo(){
        System.out.println("Pets Are Friends of Humans");
        //System.out.println("Name of Pet: "+ name); Will Not Work - STATIC METHOD CAN NOT ACCESS NON-STATIC METHOD
    }
}
