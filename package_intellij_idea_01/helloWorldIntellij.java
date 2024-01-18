package package_intellij_idea_01;
import java.time.Year;
import java.util.List;
public class helloWorldIntellij {
    public static void main(String[] args) {
        System.out.println("Loop-based solution:");
        List<String> values = List.of("2001", "1999", "2021", "2023", "2024", "1978");
        for (String s : values) {
            Year y = Year.parse(s);
            if (y.isAfter(Year.of(1975))) {
                System.out.println(s + " "); //
            }
        }

        System.out.println("Stream-based solution:");
        List<String> values2 = List.of("2001", "1999", "2021", "1111", "1112", "1113");
        values2.stream() // (1)
                .map(s -> Year.parse(s)) // (2)
                .filter(y -> y.isAfter(Year.of(1975))) // (3)
                .forEach(y -> System.out.println(y + " ")); // (4)

    }
}
