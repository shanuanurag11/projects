public class DayOfTheWeek{
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 1:
                System.out.println("1st day is Sunday");
                break;
            case 2:
                System.out.println("2nd day is monday");
                break;
            case 3:
                System.out.println("3rd day is tuesday");
                break;
            case 4:
                System.out.println("4rth day is wednesday");
                break;
            case 5:
                System.out.println("5th day is thursday");
                break;
            case 6:
                System.out.println("6th day is friday");
                break;
            case 7:
                System.out.println("7th day is saturday");
                break;
            default :
                System.out.println("invalid parameter");
                break;
        }


        //same code with if else statement

        if(day==1)
            System.out.println("1 day of the week is sunday");
        else if(day ==2)
            System.out.println("2 day of the week is monday");
        else if(day ==3)
            System.out.println("3 day of the week is tuesday");
        else if(day ==4)
            System.out.println("4 day of the week is wednesday");
        else if(day ==5)
            System.out.println("5 day of the week is thursday");
        else if(day ==6)
            System.out.println("6 day of the week is friday");
        else if(day ==7)
            System.out.println("7 day of the week is saturday");
        else
            System.out.println("invalid parameter");
    }
    public static void main(String[] args){
        printDayOfTheWeek(6);
    }
}
