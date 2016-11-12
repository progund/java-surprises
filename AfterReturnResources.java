public class AfterReturnResources{
  public static final int OK    = 0;
  public static final int ERROR = 1;
  public static int check(){
    try(Resource r = new Resource()){
        if(r.isOpen()){
          return OK;
        }else{
          return ERROR;
        }
    }finally{
      System.out.println("This runs after close() but before return!");
    }
  }

  public static void main(String[] args){
    System.out.println(check()==OK?"Open works" : "Open failed");
  }
}
class Resource implements AutoCloseable{
  boolean isOpen;
  public Resource(){ isOpen = true; }
  public boolean isOpen(){ return isOpen; }
  @Override
  public void close(){
    isOpen=false;
    System.out.println("Closing up");
    }
}
