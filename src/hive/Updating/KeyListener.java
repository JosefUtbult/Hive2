package hive.Updating;

import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {

	private Observable observable;

	protected KeyListener(Observable observable){
		this.observable = observable;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (Character.toLowerCase(e.getKeyChar())) {

			default:
				break;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
