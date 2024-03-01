package m1q;   //exception

import java.util.HashSet;

 class q9{
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE_CODE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> transformations = new HashSet<>();
        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char c : word.toCharArray()) {
                morse.append(MORSE_CODE[c - 'a']);
            }
            transformations.add(morse.toString());
        }

        return transformations.size();
    }

    public static void main(String[] args) {
        q9 source = new q9();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(source.uniqueMorseRepresentations(words)); // Output: 2
    }
}
