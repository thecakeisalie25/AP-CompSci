package yeet.frenchgame2;

/**
 * Numbers
 */
public class Conjugation extends Category {

    public static int[] pointsForms = {300, 300, 300, 500, 500, 500};
    public static String[][] answers = 
    {
        // ER verbs
        {
            "ecout",
            "aim",
            "chant",
            "dans",
            "parl",
            "jou", 
            "regard",
            "ski",
            "utilis",
            "refus",
        },
        // IR verbs
        {
            "fin",
            "chois",
            "gross",
            "magr",
            "maigr",
            "ag",
        },
        // RE verbs
        {
            "entend",
            "descend",
            "perd",
            "repond",
            "vend",
        }
    };
    String[][] endings = {
        {
            "e",
            "es",
            "e",
            "ons",
            "ez",
            "ent",
        },
        {
            "is",
            "is",
            "it",
            "issons",
            "issez",
            "issent",
        },
        {
            "s",
            "s",
            "",
            "ons",
            "ez",
            "ent",
        },
        {
            "je",
            "tu",
            "il",
            "nous",
            "vous",
            "ils"
        }
    };
    public Conjugation() {
        super();
        description =  "Category: Conjugation\n";
        description += "Given a verb and tense, conjugate it correctly.\n";
        description += "There are ER, IR and RE verbs.\n";
        description += "Singular is worth 300, plural are worth 500\n";
        description += "ER: 100 bonus, IR: 200 bonus, RE: 300 bonus\n";
        description += "Example: (note that examples are to show format, and are wrong.)\n";
        description += "nous + ecouter -> ecoutent | 500 + 100 = 600 pts\n";
        description += "je perdre -> perd | 300 + 300 = 600 pts\n";
    }

    @Override
    public Question askQuestion() {
        String qString = "(No subject pronouns) Conjugate ";
        String aString = "";
        int points = 0;
        String[] verbs;
        int typeVerb = rand.nextInt(3);
        verbs = answers[typeVerb];
        points += 100 + (typeVerb * 100);
        
        String word = verbs[rand.nextInt(verbs.length)];
        qString += word; // conjugate chois
        switch (typeVerb) {
            case 0:
                qString += "er + ";
                break;
            case 1:
                qString += "ir + ";
                break;
            case 2:
                qString += "re + ";
                break;
        } // conjugate choisir + 
        int form = rand.nextInt(6);
        qString += endings[3][form]; // conjugate choisir + nous
        aString = word + endings[typeVerb][form];
        points += pointsForms[form];
        return new Question(qString, aString, points);
    }

}