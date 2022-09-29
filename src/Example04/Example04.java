package Example04;
class Fu{
    Fu(){

    }
    void show(){
        System.out.println("Fu show");
    }
}
class Zi extends Fu{
    Zi(){

    }
    void show(){
        System.out.println("Zi show");
    }
    void Method(){
        super.show();
    }
}
public class Example04 {
    public static void main(String[] args){
        Fu f = new Fu();
        Zi z = new Zi();
        f.show();
        z.show();
        z.Method();
    }
}
