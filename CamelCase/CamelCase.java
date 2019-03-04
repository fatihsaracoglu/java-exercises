class CamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }
  
    static String toCamelCase(String s){
        String[] tokens = s.split("[-_]+");
        String result = tokens[0];
        String str = "";
    
        for (int i = 0; i < tokens.length; i++) {
            if (i > 0) {
                String s1 = tokens[i].substring(0, 1).toUpperCase();
                str = s1 + tokens[i].substring(1);
            }
            result += str;
        }
        return result;
    }
}