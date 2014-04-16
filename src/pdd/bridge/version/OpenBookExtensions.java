package pdd.bridge.version;

import pdd.bridge.portal.Portal;

/**
 * Objetivo: Nueva extensión del sistema.
 * @author beat
 *
 */
public class OpenBookExtensions {
	
	public static void superPoke(Portal me, String who, String what) {
		me.add(who, what + " you");
	}
	
}//Fin class OpenBookExtensions
