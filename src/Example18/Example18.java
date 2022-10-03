package Example18;

public class Example18 {
    static int div(int a, int b) throws Exception{
        if(b == 0){
            throw new Exception();
        }
        return a/b;
    }
    public static void main(String[] args){
        try {
            div(1,0);
        }
        catch (Exception e){
            System.out.println("除数为零");
        }
    }
}
