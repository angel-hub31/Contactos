package com.krakedev.contacto.entidades.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestCantidad {

	public static void main(String[] args) {
		Directorio dir =new Directorio();
		
		Contacto c1 =new Contacto();
		c1.setNombre("Maria");
		
		Contacto c2 =new Contacto();
		c2.setNombre("Teresa");
		
		Contacto c3 =new Contacto();
		c3.setNombre("Juana");
		
		Contacto c4 =new Contacto();
		c4.setNombre("Pedro");
		
		dir.agreagarContacto(c1);
		dir.agreagarContacto(c2);
		dir.agreagarContacto(c3);
		dir.agreagarContacto(c4);

		int Cantidad;
		Cantidad=dir.obtenerCantidadContacto();
		System.out.println("Cantidad de contactos:"+ Cantidad);
		
	
	}

}
