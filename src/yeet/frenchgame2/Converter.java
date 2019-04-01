package yeet.frenchgame2;

/**
 * Converter
 */
public class Converter {

    public static String convert6Digit(int number) {
        String output = "";
        if(number >= 2000)
        {
            output += convert3Digit(number/1000);
            if(!output.endsWith(" "))
            {
                output += " ";
            }
        }
        if(number >= 1000)
        {
            output += "mille ";
        }
        output += convert3Digit(number - ((number/1000) * 1000));
        return output;
    }
    private static String convert3Digit(int number) {
        String output = "";
        if(number >= 200)
        {
            output += convertSingleDigit(number / 100, false) + " ";
        }
        if (number >= 100) {
            output += "cent ";
        }
        output += convert2Digit(number - ((number/100) * 100));
        return output;
    }
    private static String convert2Digit(int number) {
        String output = "";
        switch(number / 10)
        {
            case 9:
                output += "quatre-vingts ";
                output += convertTeens(number - 80);
                break;
            case 8:
                output += "quatre-vingts ";
                output += convertSingleDigit(number - 80, false);
                break;
            case 7:
                output += "soixante ";
                output += convertTeens(number - 60);
                break;
            case 6:
                output += "soixante ";
                output += convertSingleDigit(number - 60, true);
                break;
            case 5:
                output += "cinquante ";
                output += convertSingleDigit(number - 50, true);
                break;
            case 4:
                output += "quarante ";
                output += convertSingleDigit(number - 40, true);
                break;
            case 3:
                output += "trente ";
                output += convertSingleDigit(number - 30, true);
                break;
            case 2:
                output += "vingt ";
                output += convertSingleDigit(number - 20, true);
                break;
            case 1:
                output += convertTeens(number);
                break;
            case 0:
                output += convertSingleDigit(number, false);
                break;
        }
        return output;
    }
    private static String convertSingleDigit(int number, boolean sixties) {
        switch (number) {
            default: return "Default case reached in ConvertSingleDigit";
            case 0:
                return "";
            case 1:
                return sixties?"et un":"un";
            case 2:
                return "deux";
            case 3:
                return "trois";
            case 4:
                return "quatre";
            case 5:
                return "cinq";
            case 6:
                return "six";
            case 7:
                return "sept";
            case 8:
                return "huit";
            case 9:
                return "neuf";
        }
    }
    private static String convertTeens(int number) {
        String output = "";
        switch (number) {
            case 10:
                output = "dix";
            break;
            case 11:
                output = "onze";
            break;
            case 12:
                output = "douze";
            break;
            case 13:
                output = "treize";
            break;
            case 14:
                output = "quatorze";
            break;
            case 15:
                output = "quinze";
            break;
            case 16:
                output = "seize";
            break;
            case 17:
                output = "dix-sept";
            break;
            case 18:
                output = "dix-huit";
            break;
            case 19:
                output = "dix-neuf";
            break;
            default: return "ERROR WITH CONVERTTEENS: PASSED NON-TEEN VALUE";
        }
        return output;
    }
}