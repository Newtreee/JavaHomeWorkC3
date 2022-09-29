package Example01;
class Person{
    void eat(){
        System.out.println("eating");
    }
    void sleep(){
        System.out.println("sleeping");
    }
}
class Student extends Person{
}
class Teacher extends Person{
}
public class Example01 {

    public static void main(String[] args){
        Student stu = new Student();
        Teacher tea = new Teacher();
        System.out.println("student : ");
        stu.eat();
        stu.sleep();
        System.out.println("teacher : ");
        tea.eat();
        tea.sleep();
    }
}
