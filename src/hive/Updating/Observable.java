package hive.Updating;

import java.util.ArrayList;

public class Observable{

	ArrayList<Observer> observers;

	public Observable(){
		observers = new ArrayList<>();
	}

	public void addObserver(Observer observer){
		observers.add(observer);
	}

	public void removeObserver(Observer observer){
		observers.remove(observer);
	}

	public void notifyAllObservers(){
		for (Observer observer : observers){
			observer.notifyObserver();
		}
	}

}
