package lab05.sol;

import tester.Tester;

public class RegexMatcherTest {

  /**
   * Tests the regexifier method.
   */
  public void testregexifier(Tester t) {
    t.checkExpect(RegexMatcher.regexifier(null, "TEST"), (""));
    t.checkExpect(RegexMatcher.regexifier("TEST", null), (""));
    t.checkExpect(RegexMatcher.regexifier(null, null), (""));

    String expect2Test = "TEST TEST";
    t.checkExpect(RegexMatcher.regexifier("TEST TEST", "TEST"), (expect2Test));
    t.checkExpect(RegexMatcher.regexifier("TESTTEST", "TEST"), (expect2Test));

    t.checkExpect(RegexMatcher.regexifier("bopt npt zpt", "\\b[onz]pt\\b"),
            "npt zpt");

    t.checkExpect(RegexMatcher.regexifier("AHHH AAH AA HH", "A+H+"), "AHHH AAH");

    t.checkExpect(RegexMatcher.regexifier("hahehahahe huhehehe haa haha he",
            "(h[ae])+"), "hahehahahe hehehe ha haha he");

    t.checkExpect(RegexMatcher.regexifier("hhh.zzz", ".*\\..*"), "hhh.zzz");

    String expect1Test = "TEST";
    t.checkExpect(RegexMatcher.regexifier("TEST TOST", "TEST"), (expect1Test));
  }

  /**
   * Tests the brownEmails method.
   */
  // public void testBrownEmails(Tester t) {
  //   t.checkExpect(RegexMatcher.brownEmails(null), "");

  //   String email = "dao_han_lim@brown.edu";

  //   t.checkExpect(RegexMatcher.brownEmails("dao_han_lim@brown.edu;"), (email));

  //   t.checkExpect(RegexMatcher.brownEmails("dao_han_lim@brown.edu"), (email));
  //   t.checkExpect(RegexMatcher.brownEmails("dao_han_lim@brown.edu "), (email));

  //   String twoEmails = "first-middle_last29@brown.edu dao_han_lim@brown.edu";
  //   t.checkExpect(
  //           RegexMatcher
  //                   .brownEmails("first-middle_last29@brown.edu;dao_han_lim@brown.edu"),
  //           (twoEmails));

  //   String email2 = "dao_han_lim@brown.edu first-middle_last29@brown.edu";
  //   t.checkExpect(
  //           RegexMatcher
  //                   .brownEmails("dao_han_lim@brown.edu first-middle_last29@brown.edu"),
  //           (email2));

  //   String email3 =
  //           "first-middle_last29@brown.edu dao_han_lim@brown.edu"
  //                   + " a_b_c_d_e88@brown.edu";
  //   t.checkExpect(
  //           RegexMatcher
  //                   .brownEmails("first-middle_last29@brown.edu dao_han_lim@brown.edu|a_b_c_d_e88@brown.edu//"),
  //           (email3));
  // }

  /**
   * Tests the findCourseCodes method.
   */
  // public void testFindCourseCodes(Tester t) {
  //   t.checkExpect(Courses.findCourseCodes(null), (""));

  //   String cs18 = "CSCI0180";
  //   t.checkExpect(Courses.findCourseCodes("CSCI0180"), (cs18));

  //   String MCM1234 = "MCM1234";
  //   t.checkExpect(Courses.findCourseCodes("MCM1234"), (MCM1234));

  //   String cs1950y = "CSCI1950Y";
  //   t.checkExpect(Courses.findCourseCodes("CSCI1950Y"), (cs1950y));

  //   String mcm1234y = "MCM1234Y";
  //   t.checkExpect(Courses.findCourseCodes("MCM1234Y"), (mcm1234y));

  //   String allTogether = "CSCI0180 MCM1234 CSCI1950Y MCM1234Y";
  //   t.checkExpect(Courses
  //           .findCourseCodes("CSCI0180 MCM1234 CSCI1950Y AB4444 MCM1234Y"),
  //           (allTogether));
  // }

  public static void main(String[] args) {
    Tester.run(new RegexMatcherTest());
  }
}
