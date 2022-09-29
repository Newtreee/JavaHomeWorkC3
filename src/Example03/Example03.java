package Example03;
class Fu{
    int num = 20;
    Fu(){

    }
}
class Zi extends Fu{
    int num = 30;
    Zi(){

    }
    void Method(){
        System.out.println("Fu's num = " + super.num);
    }
}
public class Example03 {
    public static void main(String[] args){
        Fu f = new Fu();
        Zi z = new Zi();
        System.out.println("Zi的num = "+ z.num);
        System.out.println("Fu的num = "+ f.num);
        System.out.println("Zi.method() : ");
        z.Method();

    }
}
