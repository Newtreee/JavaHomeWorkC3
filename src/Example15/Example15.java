package Example15;
interface Inter{
    void show();
    void Method();
}
class Outer{
    void function(){
        Inter In = new Inter(){
            public void show(){
                System.out.println("Show");
            }
            public void Method(){
                System.out.println("Method");
            }
        };
        In.show();
        In.Method();
    }
}
public class Example15 {
    public static void main(String[] args){
        Outer o = new Outer();
        o.function();
    }
}
