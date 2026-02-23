package strings;

public class subString {

    public static String suString(String str,int si,int ei){
       String subStr="";
       for(int i=si;i<ei;i++){
        subStr=subStr+str.charAt(i);
       }
       return subStr;


    }
    public static void main(String[] args) {

        String str = "helloworld";
        System.out.println(suString(str, 0, 5));
    }
}
