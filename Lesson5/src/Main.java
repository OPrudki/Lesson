public class Main {
  public static void main(String[] args) {
System.out.println("Lesson5");

Main main = new Main();

Student student = new Student();
System.out.println(student.name);
System.out.println(student.age);

Student student2 = new Student("John", 18);
System.out.println(student2.name);
System.out.println(student2.age);


}
class Student {
  String name;
  int age;

Student() {}
  
  Student(String n, int a) {
    name = n;
    age = a;
  }
}



  }
