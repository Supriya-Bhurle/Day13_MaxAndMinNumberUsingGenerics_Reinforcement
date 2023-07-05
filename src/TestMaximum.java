import java.util.Arrays;

public class TestMaximum <T>
{
    //Creating 3 variables.
    T[] typeArray;

    //Creating Parameterized constructor for generic data types.
    public TestMaximum(T[] typeArray)
    {
        this.typeArray = typeArray;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to the generics Problem");

        //Define the array where size is 3(given).
        Integer[] intArray = {45,62,81,74,19};
        Float[] floatArray = {7.5f,5.6f,2.8f,6.9f,6.6f,2.2f};
        String[] strArray = {"Graphs","Papaya","Apple","Peach","Banana"};

        getMaximum(new TestMaximum(intArray));
        getMaximum(new TestMaximum(floatArray));
        getMaximum(new TestMaximum(strArray));

    }

    //Get maximum from the 3 variables.
    public static <T extends Comparable<T>> void getMaximum(TestMaximum testMaximum) {
        Arrays.sort(testMaximum.typeArray);
        T max = (T) testMaximum.typeArray[0];
        int position = 0;
        for (int i = 0; i < testMaximum.typeArray.length; i++)

        {
            T a = (T)testMaximum.typeArray[i];
            int b = a.compareTo(max);
            if(b > 0)
            {
                max = (T) testMaximum.typeArray[i];
            }
        }
        System.out.println("Array is sorted.");
        System.out.println("\nMaximum integer is : "+max);
        printArray(testMaximum.typeArray);

    }
    public static void printArray(Object[] typeArray) {
        for (Object element : typeArray)
        {
            System.out.println(element+"  ");
        }
    }
}