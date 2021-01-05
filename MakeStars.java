import java.util.*;
public class MakeStars{
  public static void main(String[] args){
    Scanner n = new Scanner( System.in );
    String currentLine = "";
    String currentWord = "";
/*
    while(n.hasNextLine()){
      currentLine=n.nextLine();
      while(n.hasNext()){
        currentWord=n.next();
        for(int i=0;i<currentWord.length();i++){
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.print("\n");
    }
*/

/*
    while(n.hasNextLine()){
      while(n.hasNext()){
        currentWord=n.next();
        for(int i=0;i<currentWord.length();i++){
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println("AAAA");
    }
*/

    while(n.hasNextLine()){
      Scanner m = new Scanner( n.nextLine() );
      while(m.hasNext()){
        currentWord=m.next();
        for(int i=0;i<currentWord.length();i++){
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}
