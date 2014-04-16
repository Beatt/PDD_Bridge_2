package pdd.bridge.test;

import pdd.bridge.portal.Portal;
import pdd.bridge.sys.MyOpenBook;
import pdd.bridge.version.OpenBookExtensions;
import pdd.proxy2.proxy.MySpaceBook;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Portal me = new Portal(new MyOpenBook("Juan"));
		me.add("Hello world");
		me.add("Today I worked 18 hours");
		
		/*
		 * Vieja versión
		 * 
		 *
		MySpaceBook me = new MySpaceBook();
		me.add("Hello world");
		me.add("Today I worked 18 hours");*/
		
		/*
		 * Nueva versión
		 */
		Portal tom = new Portal(new MyOpenBook("Tom"));
		tom.poke("Juan-1");
		OpenBookExtensions.superPoke(me, "Juan-1", "Hugged");
		tom.add("Juan-1", "Poor you");
		tom.add("Hey, I'm OpenBook - it's cool!");
		
	}

}//Fin class Test
