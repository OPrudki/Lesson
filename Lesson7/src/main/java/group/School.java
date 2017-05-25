package group;

public class School {

      private String mName;
      private String mTitul;
      private int mQuantityStudSchool;

  public School (String name) {
    mName = name;
  }

  Group[] groups = new Group[10];
  int size = 0;

  public void addGroup(Group group) {
  groups[size++] = group;
  }

  public String toString() {
    return "School \"" + mName + "\"\n"
      + "Students: " + mQuantityStudSchool;
  }
}
