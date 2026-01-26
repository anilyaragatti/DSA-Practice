package Arrays;

public class linearSearch {
 
    public static int linearS(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 22; 
        int index = linearS(numbers, key);
        if (index==-1) {
            System.out.println("NOT found");
        }else{
            System.out.println("the key is found at " + index);
        }
    }
}