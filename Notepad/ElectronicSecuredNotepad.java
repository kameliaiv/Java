
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isAvailable;

	public ElectronicSecuredNotepad(int maxPages, String password) throws Exception {
		super(maxPages, password);
		this.isAvailable = false;
	}

	@Override
	public void start() {
		this.isAvailable = true;

	}

	@Override
	public void stop() {
		this.isAvailable = false;

	}

	@Override
	public boolean isStarted() {
		return this.isAvailable;
	}

}
