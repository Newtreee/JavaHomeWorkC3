package Example13;
interface Animal{
    void sleep();
}
class Cat implements Animal{
    public void sleep(){
        System.out.println("Cat sleeping......");
    }
    void catchMouse(){
        System.out.println("Cat catching mouse......");
    }
}
public class Example13 {
    public static void main(String[] args){
        Animal Ani = new Cat();
        Ani.sleep();
    }
}
