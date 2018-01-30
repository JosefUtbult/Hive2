package hive.Renderer;

import hive.Renderer.RenderingObserver;
import hive.Renderer.Renderer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Renderable {

	private Dimension dimension;
	private Point position;
	private BufferedImage image;

	public Renderable(RenderingObserver renderingObserver, BufferedImage image, Point position, Dimension dimension){
		this.image = image;
		this.position = position;
		this.dimension = dimension;

		renderingObserver.getRenderer().addRenderable(this);

	}

	public void paintComponent(Graphics graphics){
		System.out.println("Rendering component " + this.toString());
	}

}
