public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        str = str.toUpperCase();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "LEVEL";
        String input2 = "SATYAM";

        System.out.println(input1 + " -> " + (isPalindrome(input1) ? "Palindrome" : "Not Palindrome"));
        System.out.println(input2 + " -> " + (isPalindrome(input2) ? "Palindrome" : "Not Palindrome"));
    }
}

