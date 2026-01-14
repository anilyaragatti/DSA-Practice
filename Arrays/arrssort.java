package Arrays;

public class arrssort {

    public static boolean sort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numbers[] = {2,3,7,6};
        if(sort(numbers)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("flase");
        }
    }
}