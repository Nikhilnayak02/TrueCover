import java.lang.*;
import java.util.Arrays; 
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class maxCountofChar{
    public static void main(String args[]){

        String s1="dddddcccbaabbbb";
        // int[] count=new int[256];
        HashMap<Character, Integer> charCountMap = new HashMap<>();     
        char[] charArray = s1.replaceAll("\\s+", "").toCharArray();    
        for (char c : charArray) 
        {
            if (charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }     
        Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();   
        int maxCount = 0;   
        char maxChar = 0;   
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
        }
        System.out.println("Input String : "+s1);
        System.out.println("Maximum Occurring char and its count :");
        System.out.println(maxChar+" : "+maxCount);

        // for(int i=0;i<s1.length()-1;i++){
        //     count[s1.charAt(i)]++;
        // }
        // int max=0;
        // char result =0;
        
        //  for (int i = 0; i <s1.length()-1; i++) { 
        //     if (max < count[s1.charAt(i)]) { 
        //         max = count[s1.charAt(i)]; 
        //         result = s1.charAt(i); 
        //     } 
        // } 
        
        // int maxcount = count[0]; 
        //  for (int i = 1; i < 256; i++) {
        //      if (count[i] > maxcount){ 
        //          maxcount = count[i]; 
        //      }
        //  }
         
         
        // System.out.println(count[maxcount]+"->"+maxcount);
         

    }
}