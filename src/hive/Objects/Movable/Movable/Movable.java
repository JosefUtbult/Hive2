package hive.Objects.Movable.Movable;


import hive.Renderer.Renderable;
import hive.Renderer.RenderingObserver;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Movable extends Renderable {

	public Movable(RenderingObserver renderingObserver, BufferedImage image, Point position, Dimension dimension) {
		super(renderingObserver, image, position, dimension);
	}
}
