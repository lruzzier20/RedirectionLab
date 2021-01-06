import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    System.out.println(pigLatinSimple("David"));
    System.out.println(pigLatinSimple("avid"));
    System.out.println(pigLatinSimple("eavid"));
    System.out.println(pigLatinSimple("iavid"));
    System.out.println(pigLatinSimple("oavid"));
    System.out.println(pigLatinSimple("uavid"));
    System.out.println("-----------------------");
    System.out.println(pigLatin("black"));
    System.out.println(pigLatin("alack"));
    System.out.println(pigLatin("slim"));
    System.out.println(pigLatin("lol"));
    System.out.println(pigLatin("sl"));
    System.out.println(pigLatin("no"));
  }

  public static boolean weird(char[] sample, String term){
    char lookfor = term.charAt(0);
    boolean answer = false;
    for(int i=0;i<sample.length;i++){
      if(lookfor==sample[i]){answer=true;}
    }
    return answer;
  }

  public static boolean weirder(String[] digraphs, String check){
    String lookerfor = check.substring(0,2);
    boolean statement = false;
    for(int i=0;i<digraphs.length;i++){
      if(lookerfor.equals(digraphs[i])){statement=true;}
    }
    return statement;
  }

  public static String pigLatinSimple(String s){
    String fix = s.toLowerCase();
    char[] a = new char[]{'a','e','i','o','u'};
    if(weird(a, fix)){return fix + "hay";}
    return fix.substring(1) + fix.charAt(0) + "ay";
  }

  public static String pigLatin(String st){
    st = st.toLowerCase();
    char[] b = new char[]{'a','e','i','o','u'};
    String[] c = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl",
                              "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr",
                              "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp",
                              "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if(st.length()<=1){return st + "ay";}
    if(weirder(c, st)){return st.substring(2) + st.substring(0,2) + "ay";}
    if(weird(b, st)){return st + "hay";}
    return st.substring(1) + st.charAt(0) + "ay";
  }

  public static String pigLatinBest(String s){
    return "uh";
  }
}
