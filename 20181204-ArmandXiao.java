//pastPaper-2015
//key idea: String, Class
public class HiddenWord{
  private String current;
  public HiddenWord(String a){
    current = a;
  }  
  public String getHint(String s){
      String temp = "";
      boolean a = false;
      for( int i = 0; i< s.length(); i++){
          if(!a && s.substring(i,i+1).equals(current.substring(i,i+1))
              a = true;
      }
      if(a){
        if(s.substring(i,i+1).equals(current.substring(i,i+1)){
           temp += current.substring(i,i+1);
        else
           temp += "+";
      }
      else
        temp += "*";
      return temp;
           
  }
 }
