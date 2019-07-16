import java.util.Map;
import java.util.HashMap;

public class DNAStrand {
    
    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC")); // "TAACG"
        System.out.println(makeComplement("GTAT")); // "CATA"
    }

    private static String makeComplement(String dna) {
        String complement = "";

        for (int i = 0; i < dna.length(); i++) {
            complement += nucleotides.get(dna.charAt(i));
        }
        return complement;
    }

    private static final Map<Character, Character> 	nucleotides = new HashMap<>();

    static {
        nucleotides.put('A', 'T');
        nucleotides.put('T', 'A');
        nucleotides.put('G', 'C');
        nucleotides.put('C', 'G');
    }
}