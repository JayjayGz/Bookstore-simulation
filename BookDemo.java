// -------------------------------------------------------
// Assignment (0) 
// Question: (Part II) 
// Written by: (Jeffrey Gueyie and 40315016) 
// -------------------------------------------------------

//Import Scanner
import java.util.Scanner;

public class BookDemo 
{
	/**
	 * The main method manages a bookstore inventory.
	 * The user can perform various actions:
	 * Set a maximum of number of books in the inventory
	 * Add new books
	 * Modify books' information
	 * Display books' information
	 * Display books by a specific author
	 * Display a book by a specific price
	 * 
	 * @author Jeffrey Gueyie
	 * @studentID 40315016
	 * @version 1.0
	 * @since 2024-01-27
	 */
	//Main method
	public static void main(String[] args) 
	{
		//Attributes 
		int choice;
		int choicechange = 0;
		int maxBooks;
		int count = 0;
		Book[] inventory;
		final String password = "249";
				
		//Welcome message
		System.out.println("Welcome, welcome, welcome!");
		System.out.println("What is the maximum number of books that your bookstore can contain?");
		
		//Creation of Scanner
		Scanner keyin = new Scanner(System.in);
		
		Book book1 = new Book();
		
		maxBooks = keyin.nextInt();
		inventory = new Book[maxBooks]; 
			
		do
		{	
			//Main menu display
			System.out.println("What do you want do?");
			System.out.println("	1. Enter new books (password required)");
			System.out.println("	2. Change information of a book (password required)");
			System.out.println("	3. Display all books by a specific author ");
			System.out.println("	4. Display all books under a certain a price. ");
			System.out.println("	5. Quit ");
			System.out.println("Please enter your choice >");
			
	
			
			//User input of choice 
			choice = keyin.nextInt();
			
			//Switch for main menu display
			switch (choice)
			{
				//Enter new books (password required)
				case 1:
				{
					String userpassword = "";
					
					for(int i=1; i<=3; i++)
					{
						System.out.println("What is your password?");
						userpassword = keyin.next();
						
							if(password.equals(userpassword))
							{
								System.out.println("How many books do you want to enter?");
								int newBooks;
								newBooks = keyin.nextInt();
								
									if((book1.findNumberOfCreatedBooks()+newBooks)<= maxBooks )
									{	
										
										int initialCount = book1.findNumberOfCreatedBooks();
										
										for(int j=(initialCount); j < initialCount+newBooks ; j++)
										{
											
											System.out.println("Enter the author of Book #" + (j));
											String author = keyin.next();
											
											System.out.println("Enter the title of Book #" + (j));
											String title = keyin.next();
											
											System.out.println("Enter the ISBN of Book #" + (j));
											long ISBN = keyin.nextLong();
											
											System.out.println("Enter the price of Book #" + (j));
											double price = keyin.nextDouble();
											
											inventory[j] = new Book(author, title, ISBN, price);
										}
									}
									else
										System.out.println("There is only " + (maxBooks-book1.findNumberOfCreatedBooks()) 
												+ " places left in the bookstore.");	
									break;
							}	 		 
					}
				
					count++;
					
						if(count==4)
						{	
							System.out.println("Program detected suspicious "
									+ "activities and will terminate immediately!");
							System.exit(0);
						}		
				break;	
				}
				
				//Change information of a book (password required)
				case 2:
				{
					String userpassword = "";
					
					for(int i=1;i<=3; i++)
					{
						System.out.println("What is your password?");
						userpassword = keyin.next();
						
						if(password.equals(userpassword))
						{
							System.out.println("Which book do you wish to update?(1st book is Book #0)");
							
							int book = keyin.nextInt();
							
								if(inventory[book]==null)
								{
									System.out.println("There is no book registered at the location you entered. Do you wish to re-enter another book? (Enter \"Yes\" or \"No\")");
									String decision = keyin.next();
									
										if(decision.equalsIgnoreCase("Yes"))
										{
											
										}
										else
											break;
								}
								else
								{
									System.out.println("Book #" + book);
									System.out.println("Author: " + inventory[book].getAuthor());
									System.out.println("Title: " + inventory[book].getTitle());
									System.out.println("ISBN: " + inventory[book].getISBN() + "#");
									System.out.println("Price: $" + inventory[book].getPrice());	
										do
										{
											System.out.println("\nWhat information would you like to change?");
											System.out.println("     1.  author");
											System.out.println("     2.  title");
											System.out.println("     3.  IBSN");
											System.out.println("     4.  price");
											System.out.println("     5.  Quit");
											System.out.println("Enter your choice>");
											
											choicechange = keyin.nextInt();
											
										
												while (choicechange != 5) 
												 {
													switch(choicechange)
												
												
													{
														//New author 
														case 1:
														{
															System.out.println("Enter a new author");
															inventory[book].setAuthor(keyin.next());	
														break;
														}
														
														//New title
														case 2:
														{
															System.out.println("Enter a new title");
															inventory[book].setTitle(keyin.next());	
														break;
														}
														
														//New ISBN
														case 3:
														{
															System.out.println("Enter a new IBSN");
															inventory[book].setISBN(keyin.nextLong());
														break;
														}
														
														//New price
														case 4:
														{
															System.out.println("Enter a new price");
															inventory[book].setPrice(keyin.nextInt());
														break;
														}
														
														//Quit
														case 5:
														{
															
														}
														
														
													}
													break;
												 }
										}
										while(choicechange != 5);
							break;
						}
					}
				}		
				break;
				}
				
				//Display all books by a specific author
				case 3:
				{
					
					System.out.println("Enter an author's name and their books will be displayed.");
					
					String name = keyin.next();
					
					for(int i=0;i< book1.findNumberOfCreatedBooks(); i++)
					{
						if(name.equalsIgnoreCase(inventory[i].getAuthor()))
						{
							System.out.println(inventory[i]+ "\n");
						}
					}
				break;	
				}
				
				//Display all books under a certain a price
				case 4:
				{
					
					System.out.println("Enter your budget for a book.");
					
					double budget = keyin.nextDouble();
					
					
					for(int i =0; i < book1.findNumberOfCreatedBooks(); i++)
					{
						if(inventory[i].getPrice() < budget)
						{
							System.out.println(inventory[i] + "\n");
						}
					}
				break;
				}
				
				//Quit 
				case 5:
				{
					System.out.println("Thank you for visiting! Ciao, bye.");
					System.exit(0);
					
				break;
				}
			
			
			}
			
		}
		while(choice != 5);
		
	}
}
