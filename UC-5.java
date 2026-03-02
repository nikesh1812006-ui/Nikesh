public class OOPS_Banner_UC5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", " ***** "),
            "",

            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", " ***** "),
            "",

            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", " ***** "),
            String.join("", "*      "),
            String.join("", "*      "),
            "",

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