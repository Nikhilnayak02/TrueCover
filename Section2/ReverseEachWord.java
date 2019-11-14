// Write a logic to reverse each word in a given string. 
//  Example: 
//  Input : This is a sTring 
//  Output : sihT si a gnirTs

// Logic 1 : USing the split delimiter convert the string to array of words 
//           iterate through each word and reverse them using String built in methods
//           or some other technique.
//           
            //  Time Complixity : O(n^2)


// Logic 2 : Use a Stack to push Character until it reaches a blank space.
//          Then pop all the elements from the stack.itreate only once through the String
        

//     Time Complixity : O(n)
  
    // Logic 2

import java.util.*;

class ReverseEachWord{
    public static void main(String args[]){
        String str = "This is a sTring"; 
        reverseWords(str); 
    }

    static void reverseWords(String str) 
{ 
    Stack<Character> st=new Stack<Character>(); 
  
    for (int i = 0; i < str.length(); ++i) { 
        if (str.charAt(i) != ' ') 
            st.push(str.charAt(i)); 
   
       
        else { 
            while (st.empty() == false) { 
                System.out.print(st.pop()); 
                  
            } 
            System.out.print(" "); 
        } 
    } 
   
  
    while (st.empty() == false) { 
        System.out.print(st.pop()); 
          
    } 
} 
}