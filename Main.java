public class Main {

    public static void main(String[] args) {

    byte myByteValue = 9;

    short myShortValue = 1111;

    int myIntValue = 12345;

    long myLongValue = (50000L + 10 * (myByteValue+myShortValue+myIntValue));

    System.out.println("myFinalValue =" + myLongValue);  


    }
}
