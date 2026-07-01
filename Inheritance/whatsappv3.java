package Inheritance;

public class whatsappv3 extends whatsappv2 {
    public void videocalling() {
        System.out.println("videocalling");
    }

    public void audiocalling() {
        System.out.println("audiocalling");
    }

    public void textmsg() {
        System.out.println("textmsg");
    }

    public static void main(String[] args) {
        whatsappv3 v3 = new whatsappv3();
        v3.videocalling();
        v3.audiocalling();
        v3.textmsg();
    }

}








