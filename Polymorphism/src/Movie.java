public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();//Java figures out the class of instance in runtime
        System.out.println(title + " is a " + instanceType + " film");
    }

    /*below method (getMovie) creates an instance according to the movie type and returns it,
     this method creates instance in the Movie class itself instead of the Main class.
     this type of method is called FACTORY METHOD.
     Factory method gives us a way to get an object without having to know the details of how to create a new one,
     or specify the exact class we want.
    */
    public static Movie getMovie(String type, String title){
        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

class Comedy extends Movie {
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");

    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}
