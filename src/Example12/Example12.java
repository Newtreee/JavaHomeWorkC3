package Example12;
class Student{
    long sid;
    void setter(long id){
        sid = id;
    }
    public boolean equals(Object a){
        if(a instanceof Student){
            Student b = (Student)a;
            return b.sid == sid;
        }
        return false;
    }
}
public class Example12 {
    public static void main(String[] args){
        Student Lily = new Student();
        Student Lucy = new Student();
        Lily.setter(1);
        Lucy.setter(1);
        System.out.println("Lily.equals(Lucy) : " +  Lily.equals(Lucy));
        System.out.println("Lily == Lucy");
        System.out.println(Lily == Lucy);
    }
}
