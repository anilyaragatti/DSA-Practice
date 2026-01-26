package Arrays;

public class twiceEle {

    public static boolean twiceElement(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]==number[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4};
        if(twiceElement(number)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}