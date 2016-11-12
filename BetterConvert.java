import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class BetterConvert{
  public static void main(String[] args){
    try{
      File f = new File("Hello.java");
      //File f = new File("Convert.java");
      BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
      String s=null;
      while( (s=in.readLine()) != null ){
        for(char c : s.toCharArray()){
          System.out.print(String.format("\\u%04x", (int)c) );
        }
        System.out.println(); // Optional - to not have one long line for the whole program
      }
    }catch(IOException ioe){
      System.err.println("An IO exception occurred: " + ioe.getMessage());
    }catch(Exception e){
      System.err.println("An exception occorred: " + e);
    }
  }
}
