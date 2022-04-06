// 383. Ransom Note leetcode
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.
// Example 1:
// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:
// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:
// Input: ransomNote = "aa", magazine = "aab"
// Output: true


import java.util.*;
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++){
              String oldMagazine = magazine;
              magazine = magazine.replaceFirst(Character.toString(ransomNote.charAt(i)),"");
              if(magazine.equals(oldMagazine)){
                  return false;
              }
          }
          return true;
      }
      public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str1=scn.nextLine();
        String str2=scn.nextLine();
        System.out.println(canConstruct(str1,str2));
        scn.close();
      }
    
}
