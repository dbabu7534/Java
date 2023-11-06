import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

    public static void main(String[] args) {
        String text = "cat";

        // Create a pattern object.
        Pattern pattern = Pattern.compile(".*cat");  // Private Constructor

        // Create a matcher object.
        Matcher matcher = pattern.matcher(text);

        // Check if the pattern matches the text.
        if (matcher.matches()) {
            System.out.println("The pattern matches the text.");
        } else {
            System.out.println("The pattern does not match the text.");
        }
    }
}

/*In regular expressions, the .* symbol matches zero or more of any character. For example, the regular expression .*cat will match the strings "cat", "catapult", "catastrophe", etc.
The .* symbol is a powerful tool that can be used to match a wide variety of strings. However, it is important to use it carefully, as it can also be used to match strings that you do not intend to match. For example, the regular expression .*cat will also match the strings "concatenate", "category", and "cattle".
If you are unsure of how to use the .* symbol, it is best to use a more specific regular expression. For example, the regular expression cat.* will only match the strings "cat" followed by any number of characters. This will prevent it from matching the strings "concatenate", "category", and "cattle".
Here are some examples of how to use the .* symbol in Java:*/
