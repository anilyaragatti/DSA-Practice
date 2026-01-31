

public class removD {

    public static int removeElement(int numbers[]){
        int j=1;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]!=numbers[j-1]){
                numbers[j]=numbers[i];
                j++;
            }
         }
         return j;

    }
    
    public static void main(String[] args) {
        int numbers[] = {0,0,1,1,1,2,2,3,4};
        int res=removeElement(numbers);

        for(int i=0;i<res;i++){
            System.out.print(+numbers[i]+" ");
        }
 
     }
    
}
