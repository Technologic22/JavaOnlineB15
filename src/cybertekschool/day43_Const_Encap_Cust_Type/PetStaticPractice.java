package cybertekschool.day43_Const_Encap_Cust_Type;

public class PetStaticPractice {
    public static void main(String[] args) {
        String str = String.valueOf(11);
        Pet.showPetInfo();   //Works since it is static! just call using class name + method name

        // Pet.getName()   //Does Not Work since it is related to an object! wee need to create Pet obj

        Pet myPet= new Pet("Ajdar", "dog");
        System.out.println("Name: "+myPet.getName());
        myPet.voice();





    }
}
