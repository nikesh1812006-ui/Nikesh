public class OOPS_Banner_UC4 {

    public static void main(String[] args) {

        String[] banner = {

            // O
            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", " ***** "),
            "",

            // O
            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", " ***** "),
            "",

            // P
            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", " ***** "),
            String.join("", "*      "),
            String.join("", "*      "),
            "",

            // S
            String.join("", " ***** "),
            String.join("", "*      "),
            String.join("", " ***** "),
            String.join("", "      *"),
            String.join("", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}