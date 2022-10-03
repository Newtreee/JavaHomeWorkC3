package Example17;

public class Example17 {
    public static void main(String[] args){
        try{
            int x = 10/0;
            System.out.println("程序继续");
        }
        catch (Exception e){
            System.out.println("出异常类");
        }
        finally {
            System.out.println("释放资源");
        }
    }
}
