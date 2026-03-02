import java.util.HashMap;
import java.util.Map;

public class OOPS_Banner_UC7 {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Map to store character patterns
    private static Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

    // Static block to initialize patterns
    static {

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));
    }

    public static void main(String[] args) {

        String word = "OOPS";

        StringBuilder[] output = new StringBuilder[5];

        for (int i = 0; i < 5; i++) {
            output[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            CharacterPatternMap cp = patternMap.get(ch);

            if (cp != null) {

                String[] pattern = cp.getPattern();

                for (int i = 0; i < pattern.length; i++) {
                    output[i].append(pattern[i]).append("  ");
                }
            }
        }

        for (StringBuilder line : output) {
            System.out.println(line);
        }
    }
}