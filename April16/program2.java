// Ramesh and Suresh are best friends. 
// They decided to play a word game.

// The game rules are as follows:
// 	- The game board shows a word W consist of two characters only A and B.
// 	- You are allowed to replace a pair of neighbour letters AA with BB in W.
// 	- Finally, The one who failed to replace the letters will lose the game.

// You can assume that Ramesh will start playing the game always.

// Your task is to determine if Ramesh can guarantee a win.
// Print 'true', if Ramesh guarantee a win, otherwise, print 'false'.

// Input Format:
// -------------
// A string W, word.

// Output Format:
// --------------
// Print a boolean value.


// Sample Input-1:
// ---------------
// AAABAAAA

// Sample Output-1:
// ----------------
// true

// Explanation:
// ------------
// Given word is AAABAAAA 
// Ramesh -> AAABBBAA 
// Now whatever the pair Suresh replaced with BB, 
// one more replace is possible for Ramesh
// So, there is a guarantee for Ramesh to win.

// Sample Input-2:
// ---------------
// AAAAAA

// Sample Output-2:
// ----------------
// true


// Sample Input-3:
// ---------------
// AAABAAA

// Sample Output-3:
// ----------------
// false



import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int c=0;
        int r=0;
        for(int i=0;i<str.length();i++){
            System.out.println(c+" "+r);
            if(str.charAt(i)=='A'){
                c++;
                if(c==2){
                    r++;
                    c=0;
                    if(r==3){
                        System.out.println("true");
                        return;
                    }
                }
            }
            else{
            c=0;
            }          
        }
        if(r==1){
          System.out.println("true");
          return;
        }
        System.out.println("false");
    }
}


