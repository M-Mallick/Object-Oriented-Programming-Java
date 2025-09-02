// User define data type in java
class Book {
    String title;
    int price;
    Book(String name,int price) {
        this.title = name;
        this.price = price;
    }
}

public class BookDataType
{
	public static void main(String[] args) {
	    int a = 10; // datatye = int , variable = a and value = 10 // 
	    Book b1 = new Book("java Basic" , 200); // datatye = Book, variable = b and value ?,,, let's assume that our value will be the name of book
		Book b2 = new Book("C Programming" , 100);
		Book b3 = new Book("Python Programming" , 300);
		
		// datatye[] arrray_Reference = {.........};
		Book[] bookArray = {b1,b2,b3};
		
		for(int i=0; i<bookArray.length; i++){
		    System.out.println(bookArray[i].title +" - "+ bookArray[i].price);
		}
	}
}
