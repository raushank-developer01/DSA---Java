public class LetterMaping {
    final static char[][] ch= {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public static void map(int i,int length, StringBuilder sb, String n){
        if(i == length){
            System.out.println(sb.toString());
            return;
        }else{
            char[] letters = ch[Character.getNumericValue(n.charAt(i))];
            for(int j = 0; j < letters.length; j++){
                 map(i + 1, length, new StringBuilder(sb).append(letters[j]), n);
            }
        }
    }

    public static void letterCombination(String n){
        int length = n.length();
        
        if(length == 0){
            System.out.println("");
            return;
        }
        map(0, length, new StringBuilder(), n);
    }
    
    public static void main(String[] args) {
        letterCombination("23");
    }
}
