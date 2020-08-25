import java.util.Scanner;

public class VowelDouble
{
   public static void main(String [] args)
   {
      System.out.print("Enter a word :");
      String word = new Scanner(System.in).next();
      
      String vowelDouble = "";
          String vow = "aeiou";

      for (int i = 0; i < word.length(); i++) {
        if (vow.indexOf(word.charAt(i)) != -1) {
            word = word.substring(0, i + 1) + word.substring(i++, word.length());
        }

   }
      System.out.println("VowelDoubled is :" + word + ":");
   }
}
