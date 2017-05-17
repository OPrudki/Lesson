package group;

public class School {
    public void main(String[] args) {

      String mName;
      String mTitul;
      int mQuantityStudSchool;

  School (String name) {
    mName = name;
  }

  Group[] groups = new Group[10];
  int size = 0;

  public void addGroup(Group group) {
  groups[size++] = group;
  }

  }
}
