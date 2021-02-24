package lab07.sol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findCourses {
  /**
   *
   * @param input a string
   * @return a String of space-separated course codes that can be found in input
   */
  public static String findCourseCodes(String input) {
    if (input == null) {
      return "";
    }

    String regex = "([A-Z]){3,4}([0-9]){4}([A-Z])?";
    return RegexMatcher.regexifier(input, regex);
  }

  /**
   * A repl that reads user input and prints out the course codes it found until
   * EOF
   */
  public static void run() {
    try (BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in))) {
      String line;

      while ((line = reader.readLine()) != null) {
        System.out.println(findCourseCodes(line));
      }
    } catch (IOException e) {
      System.out.println("ERROR: IO EXCEPTION");
    }
  }

  public static void main(String[] args) {
    run();
  }
}
