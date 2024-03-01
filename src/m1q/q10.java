package m1q;   //find age

class Age {
    String drink;
    String vote;
    String movie;
}

class ExceptionCheck {
    public String drinkingCheck(Age a, int age) {
        try {
            if (age < 21) {
                a.drink = "illegal";qqq
                throw new IllegalAgeException("Illegal drinking age");
            } else {
                a.drink = "legal";
            }
        } catch (IllegalAgeException e) {
            return e.getMessage();
        }
        return a.drink;
    }

    public String votingCheck(Age a, int age) {
        try {
            if (age < 18) {
                a.vote = "illegal";
                throw new IllegalAgeException("Illegal voting age");
            } else {
                a.vote = "legal";
            }
        } catch (IllegalAgeException e) {
            return e.getMessage();
        }
        return a.vote;
    }

    public String movieCheck(Age a, int age) {
        try {
            if (age < 14) {
                a.movie = "illegal";
                throw new IllegalAgeException("Illegal movie-watching age");
            } else {
                a.movie = "legal";
            }
        } catch (IllegalAgeException e) {
            return e.getMessage();
        }
        return a.movie;
    }
}

class IllegalAgeException extends Exception {
    public IllegalAgeException(String s) {
        super(s);
    }
}

public class q10{ 
    public static void main(String[] args) {
        Age person = new Age();
        ExceptionCheck check = new ExceptionCheck();

        int age = 20;

        System.out.println("Drinking status: " + check.drinkingCheck(person, age));
        System.out.println("Voting status: " + check.votingCheck(person, age));
        System.out.println("Movie-watching status: " + check.movieCheck(person, age));
    }
}
