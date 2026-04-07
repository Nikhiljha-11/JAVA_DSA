public class Palindrome{
    public static void main(String[] args) {
        String str ="aba";
      //  ispalindorme(str, 0, str.length() - 1);
        if (ispalindorme(str, 0, str.length() - 1)) {
            System.out.println("palindrome is true");
        }
        else {
            System.out.println("Not a Palindrome ");
        }
    }
    static boolean ispalindorme(String str , int s , int e){
        if(s>=e) return true;
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }
        return ispalindorme(str, s+1, e-1);
    }
}