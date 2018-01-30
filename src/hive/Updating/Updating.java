package hive.Updating;

public class Updating {

	private Observable observable;
	private KeyListener keyListener;

	public Updating(){
		observable = new Observable();
		keyListener = new KeyListener(observable);
	}

	public Observable getObservable(){
		return observable;
	}
}
