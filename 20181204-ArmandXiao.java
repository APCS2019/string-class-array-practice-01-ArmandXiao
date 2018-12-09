//pastPaper-2015
//key idea: String, Class
public class HiddenWord{
  private String current;
  public HiddenWord(String a){
    current = a;
  }  
  public String getHint(String s){
      String temp = "";
     
      for( int i = 0; i< s.length(); i++){
        if(s.substring(i,i+1).equals(current.substring(i,i+1)){
           temp += current.substring(i,i+1);
       else if(current.indexOf(s.substring(i,i+1)!=-1)
           temp += "+";
       else
        temp += "*";
               
  }
   return temp;  
 }
