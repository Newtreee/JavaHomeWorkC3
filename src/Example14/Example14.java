package Example14;
interface Animal{
    void sleep();

}
class Cat implements Animal{
    public void sleep(){
        System.out.println("Cat sleeping......");
    }
}
class Pig implements Animal{
    public void sleep(){
        System.out.println("Pig sleeping......");
    }
}
public class Example14 {
    public static void main(String[] args){
        Cat c = new Cat();
        Animal a = (Animal)c;
        a.sleep();
        Pig p = (Pig)a;
    }
}
