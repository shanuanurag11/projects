public class EvenNumber {
    public static boolean isEven(int z) {


            if(z%2==0){

                return true;
            }
            else {
                return  false;


            }
        }

    public static void main(String[]args){
       int firstNum=4;
       int lastNumber=20;
       int count=0;
       int sum =0;
        while(firstNum<=lastNumber){
            firstNum++;
            if (!isEven(firstNum)){
                continue;
            }
            else {
                count++;
                sum+=firstNum;
                System.out.println(firstNum + "is an even number");
                if (count==5){
                    System.out.println("sum of even no are =" + sum);
                    break;
                }

            }


        }
        System.out.println("total no of even found = " + count);



    }

}
