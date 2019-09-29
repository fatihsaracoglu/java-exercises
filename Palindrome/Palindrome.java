public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?")); // should return true
        System.out.println(isPalindrome("I did, did I?")); // should return true
        System.out.println(isPalindrome("Hello")); // should return false
        System.out.println(isPalindrome("Don't nod")); // should return true
    }

    private static boolean isPalindrome(String s) {
        String stringLowerCaseAndNoPunctuation = s.toLowerCase().replaceAll("[^0-9a-z]","");

        LinkedStack<Character> stack = new LinkedStack<>();

        for (int i = 0; i < stringLowerCaseAndNoPunctuation.length(); i++) {
            stack.push(stringLowerCaseAndNoPunctuation.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return stringLowerCaseAndNoPunctuation.contentEquals(reversedString);
    }
}
