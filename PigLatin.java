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

  public static String pigLatin(String st){
    char[] b = new char[]{'a','e','i','o','u'};
    String[] c = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl",
                              "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr",
                              "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp",
                              "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if(weirder(c, st)){return st.subString(3) + st.subString(0,3) + "ay";}
    if(weird(b, st)){return st + "hay";}
    return st.substring(1) + st.charAt(0) + "ay";
  }
}
