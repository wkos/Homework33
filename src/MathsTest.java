public class MathsTest {
    public static void main(String[] args) {
        Maths maths = new Maths();
        int number1 = 7;
        int number2 = 8;
        System.out.println("Liczba " + number1 + " jest parzysta: " + maths.isEven(number1));
        System.out.println("Liczba " + number2 + " jest parzysta: " + maths.isEven(number2));
        System.out.println("Liczba " + number1 + " jest nieparzysta: " + maths.isOdd(number1));
        System.out.println("Liczba " + number2 + " jest nieparzysta: " + maths.isOdd(number2));
        double radius = 1.0;
        System.out.println("Pole koła o promieniu " + radius + " wynosi " + maths.circleField(radius));
        System.out.print("Kwadrat liczby " + number1 + " wynosi " + maths.power(number1));
    }
}
