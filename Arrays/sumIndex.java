package Arrays;

public class sumIndex {

    public static void sumIndexofarr(int number[],int target){
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                if((number[i]+number[j]) == target){
                    System.out.println("("+i+","+j+")");

                }
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target=9;
        sumIndexofarr(numbers, target);

    }
    
}
