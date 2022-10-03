package Example16;

public class Example16 {
    public static void main(String[] args){
        int[] arr = {1,3,6,7,2,4};
        for(int i = 0;i < 10;++i){
            try{
                System.out.println(arr[i]);
            }
            catch (Exception e){
                System.out.println("角标越界");
                break;
            }
        }
    }
}
