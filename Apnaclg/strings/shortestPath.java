package strings;

import TwodArray.start;

public class shortestPath {

    public static float checkShortestPath(String str){
        int x=0,y=0;

        for(int i=0;i<str.length();i++){
            int dir = str.charAt(i);

            //NORTH CASE
            if(dir=='N'){
                y++;
            }

            //south case
            else if(dir=='S'){
                y--;
            }

            //west
            else if(dir=='W'){
                x--;
            }

            //east
            else{
                x++;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(checkShortestPath(str));
    }
    
}
