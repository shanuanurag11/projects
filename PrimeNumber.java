public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("prime no between 1 to 100 are " );
        int count=0;
        for(int n =1;n<101;n++){
            if(isPrime(n)){
                count++;
                System.out.println( n);
                if(count==10){
                    System.out.println("only Showing first 10 prime no ");
                    break;
                }

            }
        }

    }
    public static boolean isPrime(int n){
        if(n==1){
        return false;
        }

        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;}
        }

         return true;
    }
}