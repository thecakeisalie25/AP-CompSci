package yeet.frenchgame2;

/**
 * Numbers
 */
public class Numbers extends Category {

    public Numbers() {
        super();
        description  = "Given a number in french, convert this number to numerals.\n";
        description += "Example: (note that examples are to show format, and are wrong.)\n";
        description += "dix-sept -> 16 | 200 pts\n";
        description += "six cent douze -> 714 | 300 pts\n";
    }

    @Override
    public Question askQuestion(int Difficulty) {
        int e = rand.nextInt(999999);
        return new Question("Translate the following number: " + e, String.valueOf(e), Integer.valueOf(e).toString().length());
    }


}