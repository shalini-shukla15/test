import java.io.*;
import java.util.*;
class Main1 {
  
  public static void main(String[] args) {
    // Write your code here...
    //Scanner sc  = new Scanner(System.in);
    String s = "Hi my name is ashu";

    System.out.println(Main1.getMaxMiddleLength(s));
    
  }

  public static int getMaxMiddleLength(String s){
    List<String> ss = new ArrayList<>(Arrays.asList(s.split(" ")));

    int l = ss.size();
    if(l%2==0){
      int i = l/2;
      return ss.get(i).length()>ss.get(i-1).length()?ss.get(i).length():ss.get(i-1).length();
    }else{
      int i = l/2;
      return ss.get(i).length();
    }
    
  }
}