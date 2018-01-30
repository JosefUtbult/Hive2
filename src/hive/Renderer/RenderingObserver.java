package hive.Renderer;

public class RenderingObserver extends hive.Updating.Observer {

	private Renderer renderer;

	public RenderingObserver(hive.Updating.Observable observable){
		renderer = new Renderer();
		observable.addObserver(this);
	}

	@Override
	public void notifyObserver(){
		renderer.repaint();
	}

	public Renderer getRenderer(){
		return renderer;
	}

}
