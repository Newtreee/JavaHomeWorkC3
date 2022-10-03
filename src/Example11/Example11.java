package Example11;
interface Phone{
    void receiveMessages();
    void call();
}
interface SmartPhone extends Phone{
    void faceTime();
}
class MIPhone implements SmartPhone{
    public void call(){
        System.out.println("Calling......");
    }
    public void receiveMessages(){
        System.out.println("Receiving......");
    }
    public void faceTime(){
        System.out.println("In FaceTime......");
    }
}
public class Example11 {
    public static void main(String[] args){
        MIPhone MI = new MIPhone();
        MI.call();
        MI.faceTime();
        MI.receiveMessages();
    }
}
