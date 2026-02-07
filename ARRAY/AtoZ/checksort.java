package AtoZ;

public class checksort {

    public static boolean checkSort(int number[]){
        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,0};
        if(checkSort(number)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
    
}
