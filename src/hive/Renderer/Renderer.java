package hive.Renderer;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Renderer extends JPanel {

	public ArrayList<Renderable> renderables;

	protected Renderer(){
		renderables = new ArrayList<Renderable>();

		JFrame frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.darkGray);
		setPreferredSize(new Dimension(200,200));
		setFocusable(true);

		frame.getContentPane().add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}

	public void paintComponent(Graphics graphics){
		super.paintComponent(graphics);


		for (Renderable renderable : renderables) {
			renderable.paintComponent(graphics);
		}
	}

	public void addRenderable(Renderable renderable){
		renderables.add(renderable);		//TODO: Det är inte ett riktigt error.
	}
}

