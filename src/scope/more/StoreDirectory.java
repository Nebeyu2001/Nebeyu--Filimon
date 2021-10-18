package scope.more;

public class StoreDirectory {
	private Bookstore bookstore;
	private Market market;
	public StoreDirectory(String custId){
		bookstore = new Bookstore(custId);
		market = new Market();
	}

	public int getNumberOfBooks() {
		return bookstore.getNumBooks();
	}
	public int getNumberOfBookstoreEmployees() {
		//implement

		return bookstore.getNumEmployees();
	}
	public boolean addNewEmployee(String employeeId){
		//implement
		return bookstore.addNewEmployee(employeeId);
	}
	public boolean bookIsInStock(String bookId){
		//implement
		return bookstore.bookIsInStock(bookId);
	}
	public boolean addNewBook(String bookId){
		//implement
		//System.out.println("Inside AddNewBook:StoreDirectoryt");
		try {
		return bookstore.addNewBook(bookId);
		} catch(Exception e) {

			System.out.println("Error:" + e.getMessage() );
			return false;
		}
	}
	public boolean marketCarriesFoodItem(String foodItem){
		//implement
		return market.carriesFoodItem(foodItem);
	}
}
