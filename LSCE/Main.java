
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Index movieList = new Index();
        try (Scanner s = new Scanner (System.in)) {
            char op;
            do {
                Menu();
                op = s.next().charAt(0); s.nextLine();
                switch(op) {
                    case '1': System.out.println("Name movie:");
                              int movies = s.nextInt();
                              movieList.addFirst(movies);
                              break;
                    case '2' : movieList.removeFirst();
                               break;
                    case '3' : movieList.showList();
                               break;
                    case '0' : System.out.println("Bye!");
                               break;
                    default: System.out.println("Invalid option!");
                }            
            } while (op != '0');
        }                
    }
    
    public static void Menu() {
        System.out.println("Options");
        System.out.println("1 - New movie");
        System.out.println("2 - Remove the first movie");
        System.out.println("3 - Display all movies");
        System.out.println("0 - Exit");
        System.out.print("What do you want to do?");
    }
}
