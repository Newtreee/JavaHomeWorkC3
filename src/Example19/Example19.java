package Example19;
class MyException extends Exception{

}
public class Example19 {
    static int div(int a , int b) throws MyException{
        if(b == 0){
            throw new MyException();
        }
        return a/b;
    }
    public static void main(String[] args){
        try{
            div(1,0);
        }
        catch (MyException e){
            System.out.println("My Exception working");
        }
    }
}
