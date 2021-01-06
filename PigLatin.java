import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    System.out.println(pigLatinSimple("David"));
    System.out.println(pigLatinSimple("avid"));
    System.out.println(pigLatinSimple("Eavid"));
    System.out.println(pigLatinSimple("iaviD"));
    System.out.println(pigLatinSimple("oavid"));
    System.out.println(pigLatinSimple("uavid"));
    System.out.println("-----------------------");
    System.out.println(pigLatin("blAck"));
    System.out.println(pigLatin("alack"));
    System.out.println(pigLatin("slIm"));
    System.out.println(pigLatin("lol"));
    System.out.println(pigLatin("Sl"));
    System.out.println(pigLatin("no"));
    System.out.println("-----------------------");
    System.out.println(pigLatinBest("3hello"));
    System.out.println(pigLatinBest("*dajlkwj!"));
    System.out.println(pigLatinBest(" awdaw!"));
    System.out.println(pigLatinBest("7!"));
    System.out.println(pigLatinBest("BlAck!"));
    System.out.println(pigLatinBest("fO0d!"));
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

  public static String pigLatinBest(String str){
    str = str.toLowerCase();
    String punctuation = "";
    if(!Character.isLetter((Character)str.charAt(str.length()-1)) && !Character.isDigit((Character)str.charAt(str.length()-1)))
      {punctuation=str.charAt(str.length()-1)+""; str=str.substring(0,str.length()-1);}
    if(!Character.isLetter(str.charAt(0))){return str + punctuation;}
    char[] d = new char[]{'a','e','i','o','u'};
    String[] e = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl",
                              "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr",
                              "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp",
                              "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if(str.length()<=1){return str + "ay" + punctuation;}
    if(weirder(e, str)){return str.substring(2) + str.substring(0,2) + "ay" + punctuation;}
    if(weird(d, str)){return str + "hay" + punctuation;}
    return str.substring(1) + str.charAt(0) + "ay" + punctuation;
  }
}
