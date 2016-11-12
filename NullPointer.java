public class NullPointer {
  public static void main(String[] args) {
    execute(null);
  }
  public static void execute(Test obj) {
    obj.print();
  }
}
class Test {
  public static void print() {
    System.out.println("hello");
  }
}
