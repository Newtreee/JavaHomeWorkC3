package Example02;
class Phone{
    void call(){
        System.out.println("打电话");
    }
}
class NewPhone extends Phone{
    void call(){
        System.out.println("打电话 开启语言 关闭语言");
    }
}

public class Example02 {
    public static void main(String[] args){
        Phone p = new Phone();
        NewPhone np = new NewPhone();
        p.call();
        np.call();
    }
}
