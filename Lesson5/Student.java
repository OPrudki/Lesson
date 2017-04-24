class Student{
 String name;
 int age;

    Student student = new Student();
    System.out.println(student.name);
    System.out.println(student.age);

    Student student1 = new Student("John", 18);
    System.out.println(student1.name);
    System.out.println(student1.age);

 Student() {
   this("NONE", -1);
 }

   Student(String n){
     this(n, 20);
   }

 Student(String name, int age){
   this.name = name;
   this.age = age;
 }
}
