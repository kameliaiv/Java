
public class Page {

	private String title;
	private String text;

	public Page(String title, String text) {
		if (title != null && !title.isEmpty()) {
			this.title = title;
		}
		if (text != null && !text.isEmpty()) {
			this.text = text;
		}
	}

	public void addText(String newText) {
		if (newText != null && !newText.isEmpty()) {
			this.text=this.text.concat(" " + newText);
		}
	}

	public void deleteText() {
		this.text = "";
	}

	public String reviewPage() {
		return String.format("%s\n%s", this.title, this.text);
	}

	public boolean searchWord(String word) {
		if (this.text.toLowerCase().contains(word.toLowerCase())) {
			System.out.println("The text contains the word " + word + ".");
			return true;
		}
		System.out.println("The text from this page does not contain the word " + word + ".");
		return false;
	}

	public boolean containsDigits() {
		for(int i=0;i<this.text.length();i++){
			if(Character.isDigit(this.text.charAt(i))){
				return true;
			}
		}
		
		return false;
	}
}
