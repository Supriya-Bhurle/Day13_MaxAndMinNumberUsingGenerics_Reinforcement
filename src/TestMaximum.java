public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome to the generics Problem");
        Integer number1 = 2;
        Integer number2 = 3;
        Integer number3 = 5;

        Float num1 = 21.5f;
        Float num2 = 7.6f;
        Float num3 = 12.4f;

        String name1 = "Mango";
        String name2 = "Orange";
        String name3 = "Banana";

        Integer maxInt = testMax(number1,number2,number3);
        System.out.println("Maximum integer is : "+maxInt);
        Float maxFloat = testMax(num1,num2,num3);
        System.out.println("Maximum float is : "+maxFloat);
        String maxString = testMax(name1,name2,name3);
        System.out.println("Maximum String is : "+maxString);

    }

    public static <T extends Comparable<T>> T testMax(T x,T y ,T z) {

        T maximum= x;
        if(y.compareTo(maximum) > 0 )
        {
            maximum = y;
        }
        if(z.compareTo(maximum) > 0 )
        {
            maximum = z;
        }
        return maximum;
    }
}
