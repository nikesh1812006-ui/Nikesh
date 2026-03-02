import java.util.HashMap;
import java.util.Map;

public class OOPS_Banner_UC8 {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static block to initialize patterns
    static {

        patternMap.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        patternMap.put('P', new String[]{
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        });

        patternMap.put('S', new String[]{
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        });

        //  ADD THIS BELOW S
        patternMap.put('A', new String[]{
            "   *   ",
            "  * *  ",
            " ***** ",
            " *   * ",
            " *   * "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPA");
    }

    public static void renderBanner(String word) {

        int height = 5;
        StringBuilder[] output = new StringBuilder[height];

        for (int i = 0; i < height; i++) {
            output[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            if (pattern != null) {
                for (int i = 0; i < height; i++) {
                    output[i].append(pattern[i]).append("  ");
                }
            }
        }

        for (StringBuilder line : output) {
            System.out.println(line);
        }
    }
}