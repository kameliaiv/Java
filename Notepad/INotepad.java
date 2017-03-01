
public interface INotepad {

	void addText(String text, int pageNumber);
	void replaceText(String text, int pageNumber);
	void deleteTextFromPage(int pageNumber);
	void reviewAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
