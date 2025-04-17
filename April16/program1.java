/*
Given two strings S1 and S2, find if S2 can match S1 or not.

A match that is both one-to-one (an injection) and onto (a surjection), 
i.e. a function which relates each letter in string S1 to a separate and 
distinct non-empty substring in S2, where each non-empty substring in S2
also has a corresponding letter in S1.

Return true,if S2 can match S1.
Otherwise false.

Input Format:
-------------
Line-1 -> Two strings S1 and S2

Output Format:
--------------
Print a boolean value as result.


Sample Input-1:
---------------
abab kmitngitkmitngit

Sample Output-1:
----------------
true


Sample Input-2:
---------------
aaaa kmjckmjckmjckmjc

Sample Output-2:
----------------
true

Sample Input-3:
---------------
mmnn pqrxyzpqrxyz

Sample Output-3:
----------------
false
*/

import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        LinkedHashMap<Character,String> h=new LinkedHashMap<>();
        String[]str=new String[s1.length()];
        int n=s2.length()/s1.length();
        int k=0;
        int l=n;
        for(int i=0;i<s2.length();i+=l){
          // System.out.println(n+" "+i+" "+s2.substring(i,n));
          str[k]=s2.substring(i,n);
          n=n+l;
          k=k+1;
        }
        for(int i=0;i<str.length;i++){
            Character ch=s1.charAt(i);
            if(!(h.containsKey(ch))){
                h.put(ch,str[i]);
            }
            else{
                if(!(h.get(ch).equals(str[i]))){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
        return;
    }
}