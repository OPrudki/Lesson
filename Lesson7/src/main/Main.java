// import school.JelementaryGroup;
import group.Group;
import group.School;
import student.Student;

public class Main {
   public static void main(String[] args) {
      System.out.println("Lesson 7");

// JelementaryGroup group1 = new JelementaryGroup();

School school = new School("Hillel");
Group group = new Group("Jelementary");
Student student = new Student("Ivan");
Student student1 = new Student("Maria");
Student student2 = new Student("Mr Wolf");

group.addStudent(student);
group.addStudent(student1);
group.addStudent(student2);

school.addGroup(group);

System.out.println(school);


    }
  }
