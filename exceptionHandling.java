//Exception Handling

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity{
  public String string1;
  public String string2;
  public String operator;
  public Activity(String string1,String string2,String operator){
    this.string1=string1;
    this.string2=string2;
    this.operator=operator;
  }
}
class MyException extends Exception{
  MyException(String str){
    super(str);
  }
}
public class Source {
    public String handleException(Activity a){
    try{
      if(a.string1==null || a.string2==null)
        throw new NullPointerException();
      else if(!a.operator.equals("+")&&!a.operator.equals("-"))
        throw new MyException(a.operator);
      else
       return "No Exception Found";
    }
    catch(NullPointerException ne){
      return "Null values found";
    }
    catch(Exception e){
      return e.getMessage();

    }
  }
  public String doOperation(Activity a){
    
    switch(a.operator){
      case "+":
        return a.string1+a.string2;
     
      case "-":
        return a.string1.replace(a.string2,"");
        
      default:
        return a.operator;
    }
    // return null;
  }
  
	public static void main(String args[] ) throws Exception {
    
}
}
  
	public static void main(String args[] ) throws Exception {
    
}
}