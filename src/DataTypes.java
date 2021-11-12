public class DataTypes {
    public static void main(String[] args) {

        byte b = 123;
        short s = 32767;
        int n = 1234567890;
        long nL = 1234567890123456789L;
        float f = 234234.234F;
        double nD = 123.342;

        char c = 'Y';

        boolean isTrue = true;

        var salary = 10000;
        var pension = salary * 0.03;
        
        var totalSalary = salary - pension;

        System.out.println(totalSalary);
    }
}
