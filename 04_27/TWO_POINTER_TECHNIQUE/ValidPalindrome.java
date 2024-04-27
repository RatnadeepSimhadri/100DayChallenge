class Solution {
    public static void main(String[] args) {
          String testString1 = "radar";
          System.out.println(testString1 + " is a palindrome: " + isPalindrome(testString1));
  
          String testString2 = "hello";
          System.out.println(testString2 + " is a palindrome: " + isPalindrome(testString2));
      }
  
    public static boolean isPalindrome(String s) {
         
          int left = 0 , right = s.length() - 1;
  
          while(left <= right){
              if(s.charAt(left) != s.charAt(right)) return false;
              left++;
              right--;
          }
          return true;
      }
  }