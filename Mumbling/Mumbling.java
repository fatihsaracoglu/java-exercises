public class Mumbling {
    public static void main(String[] args) {
        System.out.println(mumble("abcd"));
        System.out.println(mumble("RqaEzty"));
        System.out.println(mumble("cwAt"));
    }

    public static String mumble(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) 
                    result += s.toUpperCase().charAt(i);
                else
                    result  += s.toLowerCase().charAt(i);
            }
            if (s.length() - i != 1)
                result += "-";
        }
        return result;
    }
}
