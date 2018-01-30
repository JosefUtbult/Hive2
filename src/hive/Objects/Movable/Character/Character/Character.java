package hive.Objects.Movable.Character.Character;

import hive.Objects.Movable.Movable.Movable;
import hive.Renderer.RenderingObserver;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Character extends Movable{

	public Character(RenderingObserver renderingObserver, BufferedImage image, Point position, Dimension dimension) {
		super(renderingObserver, image, position, dimension);
	}
}

