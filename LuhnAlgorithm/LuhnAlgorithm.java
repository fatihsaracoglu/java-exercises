public class LuhnAlgorithm {

    public static void main(String[] args) {
        System.out.println(validate("91203034126940783") ? "Credit Card number is valid!" : "Credit Card number is not valid!");
    }

    public static boolean validate(String cardNo) {
        StringBuilder sb = new StringBuilder(cardNo);

        for (int i = sb.length() - 2; i >= 0; i -= 2) {
            int value = Character.getNumericValue(sb.charAt(i));
            int newValue = value * 2;
            if (newValue > 9) {
                newValue -= 9;
            }
            sb.setCharAt(i, Character.forDigit(newValue, 10));
        }

        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            int number = Character.getNumericValue(sb.charAt(i));
            sum += number;
        }

        if (sum % 10 == 0)
            return true;
        return false;
    }
}