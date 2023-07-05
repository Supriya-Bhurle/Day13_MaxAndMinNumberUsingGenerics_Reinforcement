public class TestMaximum <T extends Comparable<T>>
{
    T x,y,z;

    public TestMaximum(T x, T y, T z)
    {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum()
    {
        return TestMaximum.testMax(x, y, z);
    }
    public static void main(String[] args)
    {
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


        TestMaximum<Integer> printMaxInteger = new TestMaximum<Integer>(number1,number2,number3);
        printMaxInteger.maximum();
        TestMaximum<Float> printMaxFloat = new TestMaximum<Float>(num1,num2,num3);
        printMaxFloat.maximum();
        TestMaximum<String> printMaxString = new TestMaximum<String>(name1,name2,name3);
        printMaxString.maximum();

    }

    public static <T extends Comparable<T>> T testMax(T x,T y ,T z)
    {

        T maximum= x;
        if(y.compareTo(maximum) > 0 )
        {
            maximum = y;
        }
        if(z.compareTo(maximum) > 0 )
        {
            maximum = z;
        }
        printMax(x,y,z,maximum);
        return maximum;
    }
    public static <T> void printMax(T x,T y,T z,T maximum)
    {
        System.out.printf("Max of %s,%s and %s is %s \n ",x,y,z,maximum);
    }
}