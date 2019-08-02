

public class Operators {

    public static void main(String[] args) {
        double FirstValue = 20D;
        double SecondValue = 80D;
        double result = (FirstValue + SecondValue) * 25D;
        System.out.println("MyTotal = " + result);
        result %= 40;
        System.out.println("FinalResult = " + result);
        if (result <= 20)
            System.out.println("Total was over the limit ");
    }
}
/* use double data type and assign value 20 and 80. Add both the value and multiply the result by 25.
take the final result and find the reminder of the result by 40.Use the if statement and print " Total Was Over Limit"
if the reminder is equal to or less than 20.
 */