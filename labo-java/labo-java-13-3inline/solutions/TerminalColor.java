package pbt.util;

/**
 * TerminalColor met à disposition un ensemble de constantes permettant de
 * colorer les sorties "stdout".
 * 
 * Ca s'utilise par exemple comme suit  
 * <code>System.out.println(TerminalColor.RED + "j'écris en rouge" +
 * TerminalColor.DEFAULT);</code>.
 */
public enum TerminalColor {

    DEFAULT("\033[0m"),
    BLACK("\033[30m"),
    RED("\033[31m"),
    GREEN("\033[32m"),
    YELLOW("\033[33m"),
    BLUE("\033[34m"),
    MAGENTA("\033[35m"),
    CYAN("\033[36m"),
    WHITE("\033[38m"),
    LIGHT_GREY("\033[37m"),
    DARK_GREY("\033[90m"),
    LIGHT_RED("\033[91m"),
    LIGHT_GREEN("\033[92m"),
    LIGHT_YELLOW("\033[93m"),
    LIGHT_BLUE("\033[94m"),
    LIGHT_MAGENTA("\033[95m"),
    LIGHT_CYAN("\033[96m"),
    BLACK_UNDERLINE("\033[30;4m"),
    RED_UNDERLINE("\033[31;4m"),
    GREEN_UNDERLINE("\033[32;4m"),
    YELLOW_UNDERLINE("\033[33;4m"),
    BLUE_UNDERLINE("\033[34;4m"),
    PINK_UNDERLINE("\033[35;4m"),
    CYAN_UNDERLINE("\033[36;4m"),
    WHITE_UNDERLINE("\033[38;4m"),
    GREY_UNDERLINE("\033[37;4m"),    
    LIGHT_GREY_UNDERLINE("\033[37;4m"),
    DARK_GREY_UNDERLINE("\033[90;4m"),
    LIGHT_RED_UNDERLINE("\033[91m;4m"),
    LIGHT_GREEN_UNDERLINE("\033[92;4m"),
    LIGHT_YELLOW_UNDERLINE("\033[93;4m"),
    LIGHT_BLUE_UNDERLINE("\033[94;4m"),
    LIGHT_MAGENTA_UNDERLINE("\033[95;4m"),
    LIGHT_CYAN_UNDERLINE("\033[96;4m"),
    BLACK_BOLD("\033[30;1m"),
    RED_BOLD("\033[31;1m"),
    GREEN_BOLD("\033[32;1m"),
    YELLOW_BOLD("\033[33;1m"),
    BLUE_BOLD("\033[34;1m"),
    PINK_BOLD("\033[35;1m"),
    LIGHT_BLUE_BOLD("\033[36;1m"),
    WHITE_BOLD("\033[38;1m"),
    GREY_BOLD("\033[37;1m"),
    BG_RED("\033[41m"),
    BG_GREEN("\033[42m"),
    BG_YELLOW("\033[43m"),
    BG_BLUE("\033[44m"),
    BG_MAGENTA("\033[45m"),
    BG_CYAN("\033[46m"),
    BG_WHITE("\033[48m"),
    BG_LIGHT_GREY("\033[47m"),
    BG_LIGHT_RED("\033[101m"),
    BG_LIGHT_GREEN("\033[102m"),
    BG_LIGHT_YELLOW("\033[103m"),
    BG_LIGHT_BLUE("\033[104m"),
    BG_LIGHT_MAGENTA("\033[105m"),
    BG_LIGHT_CYAN("\033[106m"),
    BG_RED_FG_WHITE("\033[41;38;1m"),
    BG_GREEN_FG_WHITE("\033[42;38;1m"),
    BG_YELLOW_FG_WHITE("\033[43;38;1m"),
    BG_BLUE_FG_WHITE("\033[44;38;1m"),
    BG_MAGENTA_FG_WHITE("\033[45;38;1m"),
    BG_CYAN_FG_WHITE("\033[46;38;1m"),
;
    private String couleur;

    private TerminalColor(String c) {
        this.couleur = c;
    }

    @Override
    public String toString() {
        return "" + couleur;
    }
    
    


    public static void main(String[] args) {
        for (TerminalColor ct : TerminalColor.values()) {
            System.out.println("Couleur " + ct.name() + ": "
                    + ct + "essai\033[0m");
        }
    }

}
