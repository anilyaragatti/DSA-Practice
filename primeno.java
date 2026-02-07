

public class primeno {
 

    public static int seclarge(int number[]){
      int largest=Integer.MIN_VALUE;
      int seclargest = Integer.MIN_VALUE;
      for(int i=0;i<number.length;i++){
        if(number[i]>largest){
            seclargest=largest;
            largest=number[i];
        }else if(number[i]>seclargest && number[i]!=largest ){
            seclargest=number[i];
        }
      } return seclargest;
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,6,8,10,11};
        System.out.println(seclarge(number));

    }
 }