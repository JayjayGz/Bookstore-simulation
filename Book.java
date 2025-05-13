
/**
 * This class implements a book that can be bought in a bookshop.
 * It stores information such as the author, title ISBN, and price.
 * The class contains a book count to track the instances of books created.
 * 
 * @author Jeffrey Gueyie
 * @version 1.0
 */
public class Book
{
	private String author;
	private String title;
	private long ISBN;
	private double price;
	private static int numberOfBooks = 0;
	
	/**
	 * This default constructor initializes a book with empty values.
	 */
	public Book()
	{
		this.author = "";
		this.title = "";
		this.ISBN = 0L;
		this.price = 0;	
	}
	
	/**
	 * This parameterized constructor constructs a book with a specific author, title, ISBN, and price.
	 * 
	 * @param author - the author of the book
	 * @param title - the title of the book
	 * @param ISBN - the ISBN of the book
	 * @param price - the price of the book
	 */
	public Book(String author, String title, long ISBN, double price)
	{
		this.author = author;
		this.title = title;
		this.ISBN = ISBN;
		this.price = price;
		numberOfBooks++;	
	}
	
	/**
	 * This method sets the String author.
	 * 
	 * @param author - the new author of the book
	 */
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	/**
	 * This method sets the String title.
	 * 
	 * @param title - the new title of the book
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * This method sets the long ISBN.
	 * 
	 * @param ISBN - the new ISBN of the book
	 */
	public void setISBN(long ISBN)
	{
		this.ISBN = ISBN;
	}
	
	/**
	 * This method sets the double price.
	 * 
	 * @param price - the new price of The book
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	/**
	 * This method gets the author of the book.
	 * 
	 * @return - the author of the book
	 */
	public String getAuthor()
	{
		return(author);
	}
	
	/**
	 * This method gets the title of the book.
	 * 
	 * @return - the title of the book
	 */
	public String getTitle()
	{
		return(title);
	}
	
	/**
	 * This method gets the ISBN of the book
	 *  
	 * @return - the ISBN of the book
	 */
	public long getISBN()
	{
		return(ISBN);
	}
	
	/**
	 * This method gets the price of the book
	 * 
	 * @return - the price of the book
	 */
	public double getPrice()
	{
		return(price);
	}
	
	/**
	 * This method gets the total number of books created.
	 * This is a static field shared by all instances.
	 * 
	 * @return - the number of books instances created
	 */
	public static int findNumberOfCreatedBooks()
	{	
		return(numberOfBooks);
	}
	
	/**
	 * This method compares two book's ISBN and prices.
	 * 
	 * @param other the book to compare with
	 * @return - true if both ISBN and price are the same, false if otherwise
	 */
	public boolean equals(Book other) 
	{
        return (this.ISBN == other.ISBN && this.price == other.price);
	}
	
	/**
	 * This method converts the book's information (author, title, ISBN, and price) into a string.
	 * 
	 * @return a formatted string containing the book's details
	 */
	public String toString()
	{
		return("author: " + author + "\ntitle: " + title+ "\nISBN: " + ISBN + "\nprice: " + price + "$");
	}
	
    
 
	
	

}
