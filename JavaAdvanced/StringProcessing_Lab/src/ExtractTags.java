import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");

        Pattern pattern = Pattern.compile("<.+?>");

        String input;
        while (!(input = reader.readLine()).equals("END")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find())
                output.append(matcher.group()).append(System.lineSeparator());
        }

        System.out.println(output);
    }
}