
public class NotepadDemo {

	public static void main(String[] args) throws Exception {
		SimpleNotepad simpleNotepad = new SimpleNotepad(200);
		Page[] pages = { new Page("1. variables", "byte, short, int, long, double, float, char, boolean"),
				new Page("2. loops", "for-loop, while & do-while "),
				new Page("conditional operators", "if; switch-case..") };

		for (int i = 0; i < pages.length; i++) {
			simpleNotepad.addPage(pages[i]);
		}

		System.out.println(simpleNotepad.searchWord("byte"));

		simpleNotepad.deleteTextFromPage(2);
		simpleNotepad.reviewAllPages();
		simpleNotepad.printAllPagesWithDigits();
		// simpleNotepad.addText("abv abv", 2);
		// simpleNotepad.reviewAllPages();
		// simpleNotepad.deleteTextFromPage(1);
		// simpleNotepad.reviewAllPages();
		System.out.println(simpleNotepad.getMaxPages());
		SecuredNotepad securedNotepad = new SecuredNotepad(180, "Kami95");

		Page[] securedPages = { new Page("Sun", "The sun is rising "), new Page("Snow", "It is snowing outside."),
				new Page("Learning OOP",
						"Abstraction, Encapsulation, Inheritance and Polymorphism are the four major principles of OOP.") };

		for (int i = 0; i < pages.length; i++) {
			securedNotepad.addPage(pages[i]);
		}
		System.out.println(securedNotepad.getMaxPages());

		securedNotepad.addPage(new Page("ha ha", "asdf"));
		securedNotepad.reviewAllPages();
		securedNotepad.addText("hello", 2);
		securedNotepad.reviewAllPages();
	}
}
