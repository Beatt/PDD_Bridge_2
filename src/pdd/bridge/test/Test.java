package pdd.bridge.test;

import pdd.bridge.portal.Portal;
import pdd.bridge.sys.MyOpenBook;
import pdd.bridge.version.OpenBookExtensions;
import pdd.proxy2.proxy.MySpaceBook;

public class Test {

	/**
	 * Patron bridge: 
	 * 	--Puedes usarlo cuando tengas operaciones que no siempre 
	 * 		necesiten estar implementadas de la misma manera.
	 * 
	 * 	--Evitar unir la implementación directamente con la abstracción.
	 * 	--Ocultar por completo la implementación a los clientes.
	 * 	--Cambiar una implementación sin recopilar la abstracción.
	 * 	--Comibar diferentes partes del sistema en ejecución.
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
