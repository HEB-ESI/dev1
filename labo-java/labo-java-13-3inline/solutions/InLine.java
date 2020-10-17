package pbt.inline;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import pbt.util.TerminalColor;

/**
 *
 * @author Pierre Bettens (pbt) <pbettens@he2b.be>
 */
public class InLine {

    /**
     * Move bal at position <code>from</code> to position <code>to</code>.
     *
     * The move can be done if: - from position is not empty - to position is
     * empty - there are maximum 1 bal between from and to position
     *
     * <code>from</code> and <code>to</code> 0 indexed.
     *
     * @param is int array represent game board
     * @param from position wich contains bal to move
     * @param to position receive the bal after move
     */
    public static void move(int[] is, int from, int to) {
        if (from < 0 || from >= is.length
                || to < 0 || to >= is.length) {
            throw new IllegalArgumentException("from or to out of bounds");
        }
        if (is[from] == 0) {
            throw new IllegalArgumentException("From position empty");
        }
        if (is[to] != 0) {
            throw new IllegalArgumentException("To position not empty");
        }
        // Count bals between 2 positions
        int numberBals = 0;
        if (from < to) {
            // left to right
            for (int i = from + 1; i < to; i++) {
                if (is[i] != 0) {
                    numberBals++;
                }
            }
        } else {
            // right to left
            for (int i = from - 1; i > to; i--) {
                if (is[i] != 0) {
                    numberBals++;
                }
            }
        }
        if (numberBals > 1) {
            throw new IllegalArgumentException(
                    "To many bals betweew to and from positions");
        }
        is[to] = is[from];
        is[from] = 0;
    }

    /**
     * Add 2 bals at random position.
     *
     * The positions must be free else throw IllegalStateException.
     *
     * @param is int arrauy represent game board
     * @throws IllegalStateException when board has no more free place
     */
    public static void add2bals(int[] is) {
        // Should be constant class… later
        Random random = new Random();
        // Count free places to avoid infinite loop
        int freePlaces = 0;
        for (int i = 0; i < is.length; i++) {
            if (is[i] == 0) {
                freePlaces++;
            }
        }
        if (freePlaces >= 2) {
            int placedBals = 0;
            while (placedBals < 2) {
                int position = random.nextInt(is.length);
                if (is[position] == 0) {
                    is[position] = random.nextInt(5) + 1;
                    placedBals++;
                }
            }
        } else {
            throw new IllegalStateException("No more free places for 2 bals");
        }
    }

    /**
     * Display the board game.
     *
     * Just print value not nul and space when value is nul.
     *
     * @param is represent the board game.
     */
    public static void display(int[] is) {
        char[] chars = new char[is.length * 4 + 1];
        Arrays.fill(chars, '—');
        String s = new String(chars);
        DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
        df.setMinimumIntegerDigits(2);

        System.out.println("\n" + s);
        StringJoiner sjValues = new StringJoiner(" | ", "| ", " |");
        StringJoiner sjIndex = new StringJoiner("  ", " ", "  ");
        for (int i = 0; i < is.length; i++) {
            sjValues.add(is[i] != 0 ? "" + is[i] : " ");
            //sjIndex.add(""+i);
            sjIndex.add(df.format(i));
        }
        System.out.println(sjValues.toString());
        System.out.println(s);
        System.out.println(TerminalColor.LIGHT_GREY
                + sjIndex.toString()
                + TerminalColor.DEFAULT
                + "\n");
    }

    private static void displayDev1Style(int[] is) {
        System.out.print("————————————————————————————————————————————————");
        System.out.println("————————————————————————————————");
        String s = "";
        for (int i = 0; i < is.length; i++) {
            if (is[i] == 0) {
                s += "|   ";
            } else {
                s = s + "| " + is[i] + " ";
            }
        }
        System.out.println(s);
        System.out.print("————————————————————————————————————————————————");
        System.out.println("————————————————————————————————");
    }

    /**
     * Remove some contiguous bals if there are 3.
     *
     * Integer value 0 is not a bal.
     *
     * @param is the game board
     */
    public static void remove3inline(int[] is) {
        // Remove first occurence of 3 some bals
        final int SIZE = 3;
        int i = 0;
        boolean isFind = false;
        while (i <= is.length - SIZE && !isFind) {
            int j = 1;
            while (j < SIZE && is[i] != 0 && is[i] == is[i + j]) {
                j++;
            }
            if (j == SIZE) {
                isFind = true;
                is[i] = 0;
                is[i + 1] = 0;
                is[i + 2] = 0;
            }
            i++;
        }
    }

    /**
     * Read two position or quit.
     *
     * If user enter "q", quit the game. If user enter two integers values
     * between 1 and 5, return these values in string. If user enter anithing
     * else, retry.
     *
     * @return a string contains two values between 1 and 5 or quit the program
     */
    public static String askMoveReturnOrQuit() {
        Scanner keyboard = new Scanner(System.in);
        String sRead;
        do {
            System.out.print("Enter move (<from> <to> or q for quit : ");
            sRead = keyboard.nextLine();
        } while (!sRead.matches("([0-9]|1[0-9])\\s+([0-9]|1[0-9])\\s*|q\\s*"));
        if (sRead.equals("q")) {
            // Exit the game. Exit the program
            System.out.println("Ask for quit. Quit.");
            System.exit(0);
        }
        return sRead;
    }

    /**
     * Try doing a move.
     *
     * If move fail, print error message. If move is ok, add random bals and
     * remove if three contiguous bals are some values.
     *
     * @param bals game board
     */
    public static void tryMove(int[] bals) {
        String sRead = askMoveReturnOrQuit();
        String[] splitArray = sRead.split("\\s+");
        int from = Integer.parseInt(splitArray[0]);
        int to = Integer.parseInt(splitArray[1]);
        try {
            System.out.println("Try move from " + from + " to " + to);
            move(bals, from, to);
            add2bals(bals);
            remove3inline(bals);
        } catch (Exception e) {
            System.out.println("Can't move (" + e.getMessage() + ")");
        }
    }

    public static void main(String[] args) {
        // Init game
        int[] bals = new int[20];
        add2bals(bals);
        display(bals);
        while (true) {
            // Player can quit in method.
            tryMove(bals);
            display(bals);
        }
    }

}
