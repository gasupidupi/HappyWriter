package your.app;

import er.extensions.appserver.ERXSession;

public class Session extends ERXSession {
	private static final long serialVersionUID = 1L;

	public Session() {
	}
	
	@Override
	public Application application() {
		return (Application)super.application();
	}
	
	public void terminate() {
		System.out.println("Session terminating...");
		super.terminate();
	}
	
}
