package learning.java;

public class Main {
    public static void main(String[] args) {

      char unicodeChar = '\u5350';
      int emoji = 0x1F600;

        System.out.println("This is UNICODE char: " + unicodeChar);
        System.out.println("And this is emoji: " + Character.toString(emoji));
    }
}