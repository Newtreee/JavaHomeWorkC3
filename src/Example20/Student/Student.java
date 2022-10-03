package Example20.Student;
public class Student {
    int sid;
    String name;
    double score;
    public Student(){

    }
    public Student(int id,String name,double score){
        sid = id;
        this.name = name;
        this.score = score;
    }
    public void evaluation(){
        System.out.println(sid + " 号" + name + " 是 ");
        if(score > 90){
            System.out.println("三好学生");
        }
        else{
            System.out.println("普通学生");
        }
    }
}

