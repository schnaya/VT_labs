package task13;
import task12.Book;;
public class ProgrammerBook extends Book{
	private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition,
                          String language, int level) {
        super(title, author, price, edition);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){
        return super.toString()+ "(Language  " + language + ", level: " + level + ")";
    }

    @Override
    public int hashCode(){
        return 31 * super.hashCode() * language.hashCode();
    }

    @Override
    public boolean equals(Object o){
        ProgrammerBook pBook = (ProgrammerBook)o;
        return super.equals(pBook) && (pBook.level == level);
    }

}
