import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS {

    public static void main(String[] args) {

        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern p = Pattern.compile("s-s");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.group());
            System.out.println(m.group());
            System.out.println(m.group());
            System.out.println(m.group());
            System.out.println(m.group());

        }
    }
}