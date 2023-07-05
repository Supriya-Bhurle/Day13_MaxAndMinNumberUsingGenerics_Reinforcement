public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome to the generics Problem");
        Float number1 = 21.5f;
        Float number2 = 7.6f;
        Float number3 = 12.4f;
        Float maximumNum = testMax(number1,number2,number3);
        System.out.println("Maximum number is : "+maximumNum);
    }

    public static float testMax(Float number1, Float number2, Float number3) {

        Float maximumNumber = number1;
        if(number2.compareTo(maximumNumber) > 0 )
        {
            maximumNumber = number2;
        }
        if(number3.compareTo(maximumNumber) > 0 )
        {
            maximumNumber = number3;
        }
        return maximumNumber;
    }
}
