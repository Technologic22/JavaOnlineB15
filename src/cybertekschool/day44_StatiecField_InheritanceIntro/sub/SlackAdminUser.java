package cybertekschool.day44_StatiecField_InheritanceIntro.sub;

import cybertekschool.day44_StatiecField_InheritanceIntro.SlackUser;

public class SlackAdminUser extends SlackUser {
  int adminID;

  public SlackAdminUser(int adminID, String name, String status){
     this.adminID=adminID;
     this.name=name;
     this.status=status;
  }

    public static void main(String[] args) {

    SlackAdminUser user1= new SlackAdminUser(0605, "Akbar", "Admin");
  //---- inherited methods
    user1.sendAtChannelMessage();
  user1.addChannel();
  user1.deleteMessage();
//--our own methods
        user1.addChannel();
        user1.deleteMessage();
        user1.sendAtChannelMessage();
        System.out.println("user1 = " + user1);
  }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminID=" + adminID +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public void sendAtChannelMessage(){
        System.out.println(name+" sending channel Message");
    }

    public void deleteMessage(){
        System.out.println(name+" deleting message");
    }

    public void addChannel(){
        System.out.println(name+" adds new channel");

    }
}