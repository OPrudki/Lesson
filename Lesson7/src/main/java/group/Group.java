package group;
import student.Student;

public class Group {

      private String mName;
      private int mQuantityStudent;

      public Group (String name) {
        mName = name;
      }

      Student[] students = new Student[14];
      int size = 0;

      public void addStudent(Student student) {
      students[size] = student;
      size++;
      }
  }
