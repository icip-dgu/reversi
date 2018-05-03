package assignment1;

public class Reversi {
  public String reverseWords(String s) {
    String words[] = s.split(" ");
    String space = "";
    StringBuilder reversed = new StringBuilder();
    for(int i = words.length - 1; i >= 0; i--) {
      if(words[i].equals(""))
        continue;
      reversed.append(space);
      reversed.append(words[i]);
      space = " ";
    }
    return reversed.toString();
  }
}
