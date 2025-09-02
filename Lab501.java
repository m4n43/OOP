import java.util.*;

class Person {
    protected String name;
    protected String address;
    protected String department;
    public Person(String name, String address, String department) {
        this.name=name;
        this.address=address;
        this.department=department;
    }
    public void printf() {
        System.out.println("Thong tin: "+name+", "+address+", "+department);
    }
}
class Student extends Person {
    private ClassRoom classRoom;
    private Teacher gvcn;
    public Student(String name, String address, String department) {
        super(name, address, department);
    }
    public void setClass(ClassRoom classRoom) {
        this.classRoom=classRoom;
    }
    public void setgvcn(Teacher gvcn) {
        this.gvcn=gvcn;
    }
    @Override
    public void printf() {
        super.printf();
        if(classRoom!=null) {
            System.out.println("Class: "+classRoom.getName());
        }
        if(gvcn!=null) 
            System.out.println("GVCN: "+gvcn.getName()); 
    }
}
class Teacher extends Person {
    private String rank;
    public Teacher(String name, String address, String department, String rank) {
        super(name, address, department);
        this.rank=rank;
    }
    public String getRank(){
        return rank;
    }
    public String getName() {
        return name;
    }
    @Override
    public void printf() {
        super.printf();
        System.out.println("Rank: "+rank);
    } 
}
class ClassRoom {
    private String name;
    private List<Student> studentList;
    private Teacher gvcn;
    public ClassRoom(String name, Teacher gvcn)
    {
        this.name=name;
        this.gvcn=gvcn;
        this.studentList=new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addStudent(Student s) {
        studentList.add(s);
        s.setClass(this);
        s.setgvcn(gvcn);
    }
    public int numofStudent(){
        return studentList.size();
    }
    public void printlist() {
        System.out.println("Class: "+name+", Gvcn: "+gvcn.name);
        System.out.println("Number of students: "+numofStudent());
        for (Student s: studentList) {
            System.out.println(s.name);
        }
    }
}
public class Lab501 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("A1", "HN", "B1", "TS");
        Teacher t2 = new Teacher("A2", "HY", "B2", "Ths");
        ClassRoom c1 = new ClassRoom("AT21", t1);
        Student s1=new Student("C1", "HP", "D1");
        Student s2=new Student("C2", "HD", "D2");
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.printlist();
        System.out.println("\nSinh vien:");
        s1.printf();
        System.out.println();
        s2.printf();
    }   
}
