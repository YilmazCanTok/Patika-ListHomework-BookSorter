import java.util.Comparator;

public class Book implements Comparable<Book> {
      private String name;
      private String authorName;
      private String releaseYear;
      private int existingPages;

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getAuthorName() {
            return authorName;
      }

      public void setAuthorName(String authorName) {
            this.authorName = authorName;
      }

      public String getKind() {
            return releaseYear;
      }

      public void setKind(String releaseYear) {
            this.releaseYear = releaseYear;
      }

      public int getExistingPages() {
            return existingPages;
      }

      public void setExistingPages(int existingPages) {
            this.existingPages = existingPages;
      }

      public Book() {
      }

      public Book(String name, String authorName, String releaseYear, int existingPages) {
            this.name = name;
            this.authorName = authorName;
            this.releaseYear = releaseYear;
            this.existingPages = existingPages;
      }


      @Override
      public int compareTo(Book o) {
            return this.getName().compareTo(o.getName());
      }
}
