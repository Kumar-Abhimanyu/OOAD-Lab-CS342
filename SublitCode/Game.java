package SublitCode;
import java.util.Scanner;
class Game {
    protected String name;
    protected String genre;
   
    public Game(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
   
    public void play() {
        System.out.println("The " + genre + " game " + name + " is being played.");
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
       
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String genre = input[0];
            String name = input[1];
           
            if (genre.equals("First-Person") || genre.equals("Third-Person")) {
                String platform = input[2];
                Shooter obj = new Shooter(name, genre, platform);
                obj.play();
            } else if (genre.equals("Turn-Based") || genre.equals("Real-Time")) {
                int playerCount = Integer.parseInt(input[2]);
                Strategy obj1 = new Strategy(name, genre, playerCount);
                obj1.play();
            }
        }
    }
}

class Shooter extends Game {
    protected String platform;
   
    public Shooter(String name, String genre, String platform) {
        super(name, genre);
        this.platform = platform;
    }
   
    @Override
    public void play() {
        System.out.println("The " + genre + " " + name + " game on " + platform + " is being played.");
    }
}

class Strategy extends Game {
    protected int playerCount;
   
    public Strategy(String name, String genre, int playerCount) {
        super(name, genre);
        this.playerCount = playerCount;
    }
   
    @Override
    public void play() {
        System.out.println("The " + genre + " " + name + " game for " + playerCount + " players is being played.");
    }
}
