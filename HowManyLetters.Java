public class Word {
  public static String howManyCorrect(String word, String guesses) {
    int numCorrect = 0
    int i = 0
    while (i < (word.length()) && i < (guesses.length())) {
      if((word.substring(i, i + 1)).equals(guesses.substring(i, i + 1))) {
        numCorrect++;
      }
    }
    return numCorrect;
  }
}
