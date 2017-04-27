public class Main {
  public static void main(String[] args) {

/*int n = 10;
int m = 20;
    int[][] array = new int[n][m];
for (int i = 0; i < n; i++) {
  for (int j = 0; j < m; j++) {
    System.out.println(array[n][m]);
  }
}
*/
LightBulb bulb = new LightBulb();
System.out.println(bulb.isOn());
bulb.swithState();
System.out.println(bulb.isOn());

LightBulb bulb2 = new LightBulb();

System.out.println(bulb.equals(bulb2));
bulb2.swithState();
System.out.println(bulb.equals(bulb2));

System.out.println("test" == "test");
System.out.println(new String("test") == "test");

}
}

class LightBulb{
String type = "LED";
boolean state = true;

void on() {
  state = true;
}

  void off() {
    state = false;
  }

void swithState() {
    state = !state;
  }
boolean isOn() {
  return state;
}

boolean equals(LightBulb that) {
  if (this == that) return true;
  return state == that.state;
}
}
