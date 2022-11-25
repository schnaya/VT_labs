package task12;

public class Book implements Cloneable{
	
	private String title;
	private String author;
	private int price;
	private static int edition;

public Book(String title, String author, int price, int edition){
	
    this.setAuthor(author);
    this.setTitle(title);
    this.setPrice(price);
    this.edition=edition;
    
}

    @Override
    public String toString() {
        return this.getClass() + ": " + "title: " + this.getTitle() + " author: " + this.getAuthor() + " price: " + this.getPrice() + " edition: " + Book.edition;
    }
    
    @Override
    public int hashCode() {
    	 final int prime = 31;
    	    int result = 1;
    	    result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());             
    	    result = prime * result + getPrice(); 
    	    result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode()); return result;
    	    
    }
    
    
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof Book))
            return false;

        Book book = (Book)o;
        return  book.getTitle() == getTitle() &&
                book.getAuthor() == getAuthor();
    }
    
    
    
    @Override
    public Book clone(){
        return new Book(this.getTitle(), this.getAuthor(), this.getPrice(), Book.edition);
    }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



}
