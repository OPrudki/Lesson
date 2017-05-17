package group;

public class Group {
    public void main(String[] args) {

      String mName;
      int mQuantityStudent;

      Group (String name) {
        mName = name;
      }

      Student[] students = new Student[14];
      int size = 0;

      public void addStudent(Student student) {
      students[size] = student;
      size++;
      }


    }
  }
