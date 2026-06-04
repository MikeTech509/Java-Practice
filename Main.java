import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        final int SIZE = 3;
        Film[] filmArray = new Film[SIZE];

        filmTitle(filmArray);

        String result = search(filmArray, "Jesus est vivant.");
        System.out.println(result);

        input.close();
    }

    public static void filmTitle(Film[] film) {

        for (int i = 0; i < film.length; i++) {

            System.out.print("Enter title for film " + (i + 1) + ": ");
            String filmName = input.nextLine();

            film[i] = new Film(filmName);
        }
    }

    public static String search(Film[] filmArr, String titleToLookUp) {

        for (int i = 0; i < filmArr.length; i++) {

            if (filmArr[i] != null &&
                filmArr[i].getTitle().contains(titleToLookUp)) {

                return "Yes, it is.";
            }
        }

        return "No, it is not.";
    }
}

class Film {

    private String title;

    public Film(String titleValue) {
        this.title = titleValue;
    }

    public String getTitle() {
        return title;
    }
}