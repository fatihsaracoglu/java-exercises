import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {

    public static void main(String[] args) {
        System.out.println(decode(".... . .-.. .-.. ---   .-- --- .-. .-.. -..")); //HELLO WORLD
        System.out.println(decode("... --- ...")); //SOS
    }

    public static String decode(String morseCode) {
        morseCode = morseCode.trim();
        String[] splited_words = morseCode.split("\\s{3}");
        String decoded_sentence = "";

        for (int i = 0; i < splited_words.length; i++) {
            String[] splited_chars;
            splited_chars = splited_words[i].split("\\s{1}");
            for (int j = 0; j < splited_chars.length; j++) {
                decoded_sentence += morseAlphabet.get(splited_chars[j]);
            }
            if ((splited_words.length - i) != 1)
                decoded_sentence += " ";
        }

        if (decoded_sentence.contains("null"))
            return "Input includes unrecognized character(s)!";
        else
            return decoded_sentence;
    }

    private static final Map<String, Character> morseAlphabet = new HashMap<>();

    static {
        morseAlphabet.put(".-", 'A');
        morseAlphabet.put("-...", 'B');
        morseAlphabet.put("-.-.", 'C');
        morseAlphabet.put("-..", 'D');
        morseAlphabet.put(".", 'E');
        morseAlphabet.put("..-.", 'F');
        morseAlphabet.put("--.", 'G');
        morseAlphabet.put("....", 'H');
        morseAlphabet.put("..", 'I');
        morseAlphabet.put(".---", 'J');
        morseAlphabet.put("-.-", 'K');
        morseAlphabet.put(".-..", 'L');
        morseAlphabet.put("--", 'M');
        morseAlphabet.put("-.", 'N');
        morseAlphabet.put("---", 'O');
        morseAlphabet.put(".--.", 'P');
        morseAlphabet.put("--.-", 'Q');
        morseAlphabet.put(".-.", 'R');
        morseAlphabet.put("...", 'S');
        morseAlphabet.put("-", 'T');
        morseAlphabet.put("..-", 'U');
        morseAlphabet.put("...-", 'V');
        morseAlphabet.put(".--", 'W');
        morseAlphabet.put("-..-", 'X');
        morseAlphabet.put("-.--", 'Y');
        morseAlphabet.put("--..", 'Z');
        morseAlphabet.put("-----", '0');
        morseAlphabet.put(".----", '1');
        morseAlphabet.put("..---", '2');
        morseAlphabet.put("...--", '3');
        morseAlphabet.put("....-", '4');
        morseAlphabet.put(".....", '5');
        morseAlphabet.put("-....", '6');
        morseAlphabet.put("--...", '7');
        morseAlphabet.put("---..", '8');
        morseAlphabet.put("----.", '9');
    }
}