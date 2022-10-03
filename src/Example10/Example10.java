package Example10;

import java.lang.reflect.Method;

interface Inter{
    int num = 20;
    void Method();
}
class InterImpl implements Inter{
    public void Method(){
        System.out.println("num = " + num);
    }
}
public class Example10 {
    public static void main(String[] args){
        InterImpl I1 = new InterImpl();
        I1.Method();
    }
}
