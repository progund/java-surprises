public class StrangeLoop{
  public static void main(String[] args){
    int j=0;
    for(int i = 0; i<100; i++){
      j = j++;
    }
    // What will it print?
    System.out.println("j: " + j);
  }
}
