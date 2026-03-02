public class OOPS_Banner_UC6 {

    public static void main(String[] args) {

        String[] banner = combine(
                buildO(),
                buildO(),
                buildP(),
                buildS()
        );

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] combine(String[]... letters) {

        int totalLength = 0;

        for (String[] letter : letters) {
            totalLength += letter.length;
        }

        totalLength += (letters.length - 1);

        String[] result = new String[totalLength];

        int index = 0;

        for (int i = 0; i < letters.length; i++) {
            for (String line : letters[i]) {
                result[index++] = line;
            }

            if (i < letters.length - 1) {
                result[index++] = "";
            }
        }

        return result;
    }

    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}