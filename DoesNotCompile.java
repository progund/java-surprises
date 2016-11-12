public class DoesNotCompile{
  public static void main(String[] args){
    System.out.println("Unicode radiation warning: \u2622");
    System.out.println("This is unicode too: \u000a");
    // Why does this class not compile?
    // What does the error message from javac say?
    // What do we learn about Java source code from this?
  }
}
