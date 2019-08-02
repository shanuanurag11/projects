
/*
        taking input from user and find min and max value
        if user input wrong parametere break the loop
        */
 



import java.util.Scanner;

public class MinMaxInput {
    public static void main(String[]args){
        Scanner scannerVariable=new Scanner(System.in);

        int minNumber=0;
        int maxNumber=0;
        boolean yy=true;


        while(true){
            boolean isInt=scannerVariable.hasNextInt();
            System.out.println("enter the no:");

          if(isInt) {
              int variable = scannerVariable.nextInt();

              if (yy) {
                  yy = false;
                  minNumber = variable;
                  maxNumber = variable;
              }

              if (variable > maxNumber) {
                 maxNumber= variable ;
              }
              if (variable < minNumber) {
                  minNumber=variable ;
              }
          }
            else {
                break;
            }

            scannerVariable.nextLine();
        }
        System.out.println("min no is : " +minNumber +" ,and max no is :" + maxNumber);


        scannerVariable.close();


    }
}
