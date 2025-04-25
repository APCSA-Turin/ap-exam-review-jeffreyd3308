public class Textbook extends Book{
	private int edition;
	
	public Textbook(String bookTitle, double bookPrice, int edition) {
		super(bookTitle, bookPrice);
		this.edition = edition;
	}

	public int getEdition() {
		return edition;
	}

	@Override
	public String getBookInfo() {
		return super.getBookInfo() + "-" + edition;
	}

	public boolean canSubstituteFor(Book book) {
		if (super.getTitle().equals(book.getTitle()) && getEdition() > ((Textbook)book).getEdition()) {
			return true;
		}
        return false;
	}
}
