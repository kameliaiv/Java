import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad{
	private static final int CONDITION_TO_BE_PASSWORD = 3;
	private static final int MIN_LENGTH_FOR_PASSWORD = 5;
	Scanner sc = new Scanner(System.in);
	private String password;
	
	public SecuredNotepad(final int maxPages, final String password) throws Exception {
		super(maxPages);
		if (checkPassword(password)) {
			this.password = password;
		} else {
			throw new Exception(
					"The password should contain at least 5 symbols, at least one lower case letter, one upper case letter and a digit!");
		}
	}

	public boolean checkPassword(String password) {
		if (password != null && password.length() >= MIN_LENGTH_FOR_PASSWORD) {
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z' && count1 == 0) {
					count1++;
				}
				if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' && count2 == 0) {
					count2++;
				}
				if (Character.isDigit(password.charAt(i)) && count3 == 0) {
					count3++;
				}
				if (count1 + count2 + count3 == CONDITION_TO_BE_PASSWORD) {
					return true;
				}
			}
		}
		return false;
	}

	boolean askForPassword() {
		System.out.println("Please, enter a password.");
		String passwordForAccess = sc.nextLine();

		if (this.password.equals(passwordForAccess)) {
			System.out.println("You are allowed to make changes.");
			return true;

		} else {
			System.out.println("Wrong password! Next try. ");
			return askForPassword();
		}
	}

	@Override
	void addPage(Page newPage) {
		if (askForPassword()) {
			super.addPage(newPage);
		}
	}

	@Override
	public void addText(String text, int pageNumber) {
		if (askForPassword()) {
			super.addText(text, pageNumber);
		}

	}

	@Override
	public void replaceText(String text, int pageNumber) {
		if (askForPassword()) {
			super.replaceText(text, pageNumber);
		}
	}

	@Override
	public void deleteTextFromPage(int pageNumber) {
		if (askForPassword()) {
			super.deleteTextFromPage(pageNumber);
		}
	}

	@Override
	public void reviewAllPages() {
		if (askForPassword()) {
			super.reviewAllPages();
		}
	}

}
