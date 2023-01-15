import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class main {
    public static void main(String[] args){
        Book HungerGames = new Book("Hunger Games","Suzanne Collins","2005",300);
        Book HarryPotter = new Book("Philosopher's Stone","J.K. Rowling","2001",200);
        Book LordOfTheRings = new Book("Conquest","J.R.R. Tolkien", "1995",600);
        Book GOT = new Book("Game of Thrones","George R. R. Martin","2005",2000);
        Book ForrestGump = new Book("Forrest Gump","Winsten Groom","2017",500);
        TreeSet<Book> books = new TreeSet<Book>();
        System.out.println("***********************************************************************");
        books.add(HungerGames);
        books.add(ForrestGump);
        books.add(HarryPotter);
        books.add(GOT);
        books.add(LordOfTheRings);

        for (Book books1: books) {
            System.out.println(books1.getName());
        }

        TreeSet<Book> bookTreeSet = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book o3, Book o4) {
                return o3.getExistingPages()-o4.getExistingPages();
            }
        });

        bookTreeSet.add(HarryPotter);
        bookTreeSet.add(HungerGames);
        bookTreeSet.add(ForrestGump);
        bookTreeSet.add(GOT);
        bookTreeSet.add(LordOfTheRings);
        for (Book books2: bookTreeSet) {
            System.out.println(books2.getName()+" has "+books2.getExistingPages()+" pages");
        }


    }
}
