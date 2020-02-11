package cybertekschool.day09_;

public class LanguagePicker {
    public static void main(String[] args) {

        // assume u r on a call

        //1-->>"hello
        //2-->>Salam
        //3--..Hola
        //4--Privet
        //5-->>Bonjour
        //6-->>Nihao
        //7-->>Merhaba

        String greeting = "";

        int languageCode= 2;

        if (languageCode==1){
            greeting = "Hello";
        } else if (languageCode==2){
            greeting= "Salam";
        } else if (languageCode==3){
            greeting = "Bonjour";
        } else {greeting="Unknown language";
        }
        System.out.println(greeting+ " , SDET!!!");


    }
}
