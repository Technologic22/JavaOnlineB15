package cybertekschool.day44_StatiecField_InheritanceIntro;

public class SlackUser {
    protected String name;
    protected String status;

    public void sendMessage(){
        System.out.println("Slackuser"+name+" Typing Message");
    }

    public void callSomeone(){
        System.out.println("SlackUser "+name+" Calling");
    }

    public void addEmoji(){
        System.out.println("SlackUser "+name+" Can add Emoji");

    }
}
