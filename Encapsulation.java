// Encapsulation:-
// Get And Set Method:

class iamstudent{   // class name [iamstudent]
    String name;    // class Properties
    int age;

    public String getName() {       // Getter And Setter [Method]
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        iamstudent student = new iamstudent();  // Creating An Object of Class [iamstudent]
        student.name = "Prakash Kumar";
        student.setAge(20);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}




