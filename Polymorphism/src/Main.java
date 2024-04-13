import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//
//        Movie theMovie2 = Movie.getMovie("Science Fiction","Star Wars");
//        theMovie2.watchMovie();

        Scanner s = new Scanner(System.in);
        /* Below loop takes input from the user and creates the instance and runs the watchMovie method */
        while(true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to Quit: ");
            String type = s.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }



    }
}
