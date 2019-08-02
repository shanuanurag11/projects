public class FootInchesCm {
    public static double calcFootInchesToCentimeters(double feet, double inches) {
     if((feet >= 0) || (inches >=0) || (inches<=12)){
    double centimeters = feet *12*2.54;
    centimeters =(inches*2.54)+centimeters;
         System.out.println(feet +" ft " + inches + "inches" + "is equal to " + centimeters + "cm");
    return centimeters;
        }
     else {
         System.out.println("Invalid Parameters");
         return -1;}


    }
    public static double calcFootInchesToCentimeters(double inches) {
        if (inches<=0){
            System.out.println ("Invalid Inches");
            return -1;
        }
else {
    double feet =(int) inches/12;
    double remaininginches=inches %12;
            System.out.println(inches+ "inches equal to "+ feet+ "ft" + remaininginches+ "inches");
            return remaininginches;

        }
    }

    public static void main(String[] args){
    calcFootInchesToCentimeters(5,8);
        calcFootInchesToCentimeters(157);

    }
}
