package hive.Objects.Movable.Character.Player;

import hive.Objects.Movable.Character.Character.Character;
import hive.Renderer.RenderingObserver;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Character {


	public Player(RenderingObserver renderingObserver, BufferedImage image, Point position, Dimension dimension) {
		super(renderingObserver, image, position, dimension);
	}
}
