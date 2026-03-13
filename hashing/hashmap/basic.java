package hashing.hashmap;

import java.util.HashMap;

import LeetCode.sortColour;

public class basic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
       //insertion
        map.put("indea", 13);
        map.put("us", 19);

        System.out.println(map); 
        map.put("indea", 130); //  here it update the old key,value
        System.out.println(map);


        //search-two types 1map.containsKey 2map.get
        if(map.containsKey("indea")){
            System.out.println("the key is present in the map");
        }else{
            System.out.println("the key is not present in the key");
        }

        System.out.println(map.get("us"));

    }
    
}
