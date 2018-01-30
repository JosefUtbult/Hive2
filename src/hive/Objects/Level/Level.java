package hive.Objects.Level;

import hive.Renderer.Renderable;
import hive.Renderer.RenderingObserver;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Level extends Renderable {

	public Level(String filePath){


		try {

		}
	}

	public Level(RenderingObserver renderingObserver, BufferedImage image, Point position, Dimension dimension) {
		super(renderingObserver, image, position, dimension);
	}
}
