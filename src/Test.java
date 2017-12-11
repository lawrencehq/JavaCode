import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: Qi Huang
 * Date: 2017/12/11
 * Purpose: Test
 */
public class Test {
    public static void main(String args[]) {
        // Test Java Regular Expression Pattern
        String testUrl = "https://leetcode.com/problems/design-tinyurl";
        Matcher m = JavaRegexPatterns.WEB_URL.matcher(testUrl);
        if (m.find()) {
            System.out.println(m.group(0));
        } else {
            System.out.println("No match");
        }

    }
}
