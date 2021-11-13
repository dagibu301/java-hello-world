public class SwitchStatement {
    public static void main(String[] args) {

        int age = 20;

        switch (age) {
            case 1 -> System.out.println("You are 1 year old!");
            case 20 -> System.out.println("You are 20 years old!");
            default -> System.out.println("Nope");
        }
    }
}
