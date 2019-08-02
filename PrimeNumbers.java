public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("prime no bet 1 to 50 are");
        int count = 0;
        for (int i = 1; i < 50; i++) {
            boolean yy = true;
            if (i == 1) {
                yy = false;
            }
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    yy = false;
                    break;
                }

            }


            if (yy == true) {
                count++;
                System.out.println(i);
                if (count == 5) {
                    System.out.println("first 5 prime no are above");
                    break;
                }


            }
        }
    }
}
                                                              
															  
															  /* 1st 5 prime nos without using method */
