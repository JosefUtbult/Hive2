package hive;

import hive.Renderer.Renderable;
import hive.Renderer.RenderingObserver;
import hive.Updating.Updating;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

		Updating updating = new Updating();
		RenderingObserver renderingObserver = new RenderingObserver(updating.getObservable());
		Renderable renderable = new Renderable(renderingObserver, null, new Point(1, 2), new Dimension(1, 2));

		updating.getObservable().notifyAllObservers();
    }
}

