public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome to the generics Problem");
        String name1 = "Mango";
        String name2 = "orange";
        String name3 = "Banana";
        String maximum = testMax(name1,name2,name3);
        System.out.println("Maximum length of string is : "+maximum);
    }

    public static String testMax(String name1, String name2, String name3) {

        String maximum= name1;
        if(name2.compareTo(maximum) > 0 )
        {
            maximum = name2;
        }
        if(name3.compareTo(maximum) > 0 )
        {
            maximum = name3;
        }
        return maximum;
    }
}
