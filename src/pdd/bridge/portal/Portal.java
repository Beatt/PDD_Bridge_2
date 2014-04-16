package pdd.bridge.portal;

import pdd.bridge.bridge.IBridge;

/**
 * Objetivo: Abstraction: Mantiene una referencia a un objeto de tipo
 * 	Bridge. 
 * @author beat
 *
 */
public class Portal {

	private IBridge bridge;
	
	public Portal(IBridge aSpaceBook) {
		bridge = aSpaceBook;
	}
	
	public void add(String message) {
		bridge.add(message);
	}
	
	public void add(String friend, String message) {
		bridge.add(friend, message);
	}
	
	public void poke(String who) {
		bridge.poke(who);
	}
	
}//Fin class Portal
