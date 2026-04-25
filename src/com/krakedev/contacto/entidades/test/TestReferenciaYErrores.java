package com.krakedev.contacto.entidades.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestReferenciaYErrores {

	public static void main(String[] args) {
		Directorio dir =new Directorio();
		
		Contacto c1 =new Contacto();
		c1.setNombre("Maria"); 
		
		dir.agreagarContacto(c1);
		dir.agreagarContacto(new Contacto());
		Contacto c=dir.obtenerContacto(4);
		System.out.println("Nombre: "+c.getNombre());
	}

}
