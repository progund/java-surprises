public class AfterReturn{
  public static int five(){
    try{
      return 5;
    }finally{
      System.out.println("And now this!");
    }
  }

  public static void main(String[] args){
    System.out.println(five());
  }
}
