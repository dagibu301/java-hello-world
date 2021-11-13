public class SwitchStatement {
    public static void main(String[] args) {

        int age = 20;
        printAge(age);
    }

    /**
     * Description: Switch to print age
     *
     * @param age age of the person
     * @return void
     * */
    public static void printAge(int age) {
        switch (age) {
            case 1 -> System.out.println("You are 1 year old!");
            case 20 -> System.out.println("You are 20 years old!");
            default -> System.out.println("Nope");
        }
    }
}
