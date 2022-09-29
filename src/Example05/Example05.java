package Example05;
class Fu{
    Fu(){
        System.out.println("Fu 构造方法调用");
    }
}
class Zi extends Fu{
    Zi(){
        super();
        System.out.println("Zi 构造方法调用");
    }
}
public class Example05 {
    public static void main(String[] args){
        Fu f = new Fu();
        Zi z = new Zi();

    }
}
