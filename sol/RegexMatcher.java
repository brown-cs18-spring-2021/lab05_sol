package sol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegexMatcher is a class that allows users to enter strings and a regex and
 * compare them.
 * 
 */
public class RegexMatcher {

  /**
   * @param input a string
   * @param regex a regex to be used to find matches in the string
   * @return a string of the space-separated matches of regex inside input
   */
  public static String regexifier(String input, String regex) {
    String toReturn = "";
    if (input == null || regex == null) {
      return toReturn;
    }

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      toReturn += matcher.group() + " ";
    }

    return toReturn.trim();
  }

  /**
   * 
   * @param input a string
   * @return a string of space separated brown emails that, in the input string,
   *         are surrounded by word boundraries
   */
  public static String brownEmails(String input) {
    if (input == null) {
      return "";
    }

    String regex = "\\b[a-z\\-]+(_[a-z\\-]+)+\\d*(@brown\\.edu)\\b";
    return regexifier(input, regex);
  }
}
