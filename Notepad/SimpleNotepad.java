
public class SimpleNotepad implements INotepad {

	private Page[] pages;
	protected final int maxPages;
	private int currentPage;

	public SimpleNotepad(final int maxPages) {
		this.maxPages = maxPages;
		this.currentPage = 0;
		this.pages = new Page[this.maxPages];
	}

	void addPage(Page newPage) {
		if (this.currentPage + 1 >= this.maxPages) {
			return;
		}
		this.pages[this.currentPage++] = newPage;
	}

	@Override
	public void addText(String text, int pageNumber) {
		if (pageNumber < this.maxPages && pageNumber >= 0) {
			pages[pageNumber].addText(text);
		}

	}

	@Override
	public void replaceText(String text, int pageNumber) {
		if (pageNumber < this.maxPages && pageNumber > 0) {
			pages[pageNumber].deleteText();
			pages[pageNumber].addText(text);
		}

	}

	@Override
	public void deleteTextFromPage(int pageNumber) {
		if (pageNumber < this.pages.length && pageNumber >= 0) {
			pages[pageNumber].deleteText();
		}

	}

	@Override
	public void reviewAllPages() {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i]!=null){

				System.out.println(pages[i].reviewPage());
			}
		}

	}

	@Override
	public boolean searchWord(String word) {
		
		for(int i=0;i<pages.length;i++){
			if (word != null && !word.isEmpty()) {
				if (pages[i].searchWord(word)) {
					return true;
				}
			}
		}
		
		return false;
	}

	int idx = 0;

	@Override
	public void printAllPagesWithDigits() {

		for(int i = 0; i<pages.length;i++){
			if(pages[i]!=null && pages[i].containsDigits()){
				System.out.println(pages[i].reviewPage());
			}
		}
	}

	Page[] getPages() {
		return this.pages;
	}

	int getMaxPages() {
		return this.maxPages;
	}

	int getCurrentPage() {
		return this.currentPage;
	}

}
