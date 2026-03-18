

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Letter O
        String[] O = {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };

        // Letter P
        String[] P = {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };

        // Letter S
        String[] S = {
                " ****** ",
                " *      ",
                " *      ",
                " *****  ",
                "      * ",
                "      * ",
                " ****** "
        };

        String word = "OOPS";

        // Loop through rows
        for (int i = 0; i < 7; i++) {

            // Loop through characters
            for (char ch : word.toCharArray()) {

                if (ch == 'O') {
                    System.out.print(O[i] + " ");
                } else if (ch == 'P') {
                    System.out.print(P[i] + " ");
                } else if (ch == 'S') {
                    System.out.print(S[i] + " ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}
