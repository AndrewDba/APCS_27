package pkg;


public class Movie{
    //Global variables

    private String MovieName;
    private Double Rating;
    private double numRating;
    private int revenue;
    

    //Constructors
     
    public Movie() {
        MovieName = "Avengers";
        Rating = 8.0;
        numRating = 33;
        revenue = 623357910;
    }

    public Movie(String m, Double r, int n, int rev) {
        MovieName = m;
        Rating = r;
        numRating = n;
        revenue = rev;
    }

    public Double addRating(Double n){
        numRating = n;
    }

    //--------------------------------------------------------
    
    
    
    
    //Methods

    public void movieToString(){
        System.out.println("Movie: " + MovieName);
        System.out.println("Rating: " + Rating);
        System.out.println("Number of Ratings: " + numRating);
        System.out.println("Revenue: " + revenue);
    }



   
    
   
    



































}