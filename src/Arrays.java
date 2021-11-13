import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String[][] cities = new String[4][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);


        System.out.println();
        List<String> Days = new ArrayList<>();
        Days.add("Monday");
        Days.add("Tuesday");
        Days.forEach((n) -> System.out.println(n));
    }
}
