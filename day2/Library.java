package week1.day2;

public class Library
{
    public String addbook(String bookTitle)
    {
    	System.out.println("Book Added Successfully");
    	return bookTitle;
    }
    
    public void issuebook()
    {
    	System.out.println("Book Issued Successfully");
    }
	public static void main(String[] args)
	{
		
    Library b=new Library();
   String addbook = b.addbook("Dictionary");
   System.out.println(addbook);
    b.issuebook();
	}

}
