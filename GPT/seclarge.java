package GPT;

public class seclarge {

    public static int secondlarg(int number[]){
        int largest=Integer.MIN_VALUE;
        int seclargest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>largest){
            seclargest=largest;
            largest=number[i];
        }else if(number[i]>seclargest && number[i]!=largest){
            seclargest=number[i];
        }
    }
        return seclargest;
    }

    public static void main(String[] args) {
        int number[ ]  = {5,3,1,0,2,4};
        System.out.println(secondlarg(number));
    }
    
}
