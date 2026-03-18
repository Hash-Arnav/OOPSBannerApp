import java.util.HashMap;

public class OOPSBannerApp {

    // Create character map
    public static HashMap<Character, String[]> createMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        map.put('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        map.put('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        });

        map.put(' ', new String[]{
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     "
        });

        return map;
    }

    // Display banner
    public static void display(String msg, HashMap<Character, String[]> map) {

        int height = map.get('O').length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : msg.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> map = createMap();
        display("OOPS", map);
    }
}