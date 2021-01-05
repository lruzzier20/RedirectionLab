import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    System.out.println(pigLatinSimple("david"));
  }

  public static boolean weird(char[] sample, String term){
    char lookfor = term.charAt(0);
    boolean answer = false;
    for(int i=0;i<sample.length;i++){
      if(lookfor==sample[i]){answer=true;}
    }
    return answer;
  }

  public static String pigLatinSimple(String s){
    char[] a = new char[]{'a','e','i','o','u'};
    if(weird(a, s)){return s + "hay";}
    return s.substring(1) + s.charAt(0) + "ay";
  }


}
