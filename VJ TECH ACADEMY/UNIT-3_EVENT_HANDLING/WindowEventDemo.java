import java.awt.*;
import java.awt.event.*;

class WindowEventDemo extends Frame implements WindowListener {
	WindowEventDemo() {
		addWindowListener(this);
	}

	public void windowClosing(WindowEvent we) {
		System.out.println("window closing");
		dispose();
	}

	public void windowClosed(WindowEvent we) {
		System.out.println("window closed");
	}

	public void windowOpened(WindowEvent we) {
		System.out.println("window opened");
	}

	public void windowIconified(WindowEvent we) {
		System.out.println("window Iconified");
	}

	public void windowDeiconified(WindowEvent we) {
		System.out.println("window Deiconified");
	}

	public void windowActivated(WindowEvent we) {
		System.out.println("window Activated");
	}

	public void windowDeactivated(WindowEvent we) {
		System.out.println("window Deactivated");
	}

	public void windowLostFocus(WindowEvent we) {
		System.out.println("window Lost Focus");
	}

	public void windowGainFocus(WindowEvent we) {
		System.out.println("window Gain Focus");
	}

	public static void main(String args[]) {
		WindowEventDemo w1 = new WindowEventDemo();
		w1.setVisible(true);
		w1.setTitle("Window Frame");
		w1.setSize(500, 500);
	}
}