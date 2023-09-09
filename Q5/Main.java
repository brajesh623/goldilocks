/* 5. Write a program to store the value in Hashmap (key, store) and then
search those given value from the hashmap and print it.
a. Name is key and age is value so store some sample values like
i. (Ram, 36), (shyam,60) */
import java.util.*;

public class Main {
    public static void main(String[] args) {
       HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Ram",36);
        hm.put("Shyam",40);
        hm.put("Sohan",38);
        hm.put("Mohan",42);
        hm.put("Rohit",45);
        for(Map.Entry<String,Integer> x:hm.entrySet()){
            if(x.getValue()== 42){
                System.out.println(x.getKey()+","+ x.getValue());
            }
        }
    }
}
