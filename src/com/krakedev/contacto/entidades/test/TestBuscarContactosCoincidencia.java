package com.krakedev.contacto.entidades.test;

import java.util.ArrayList;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestBuscarContactosCoincidencia {

	public static void main(String[] args) {
		Directorio dir = new Directorio();

		Contacto c1 = new Contacto();
		c1.setNombre("Maria");
		c1.setCelular("123456789");
		Contacto c2 = new Contacto();
		c2.setNombre("Teresa");
		c2.setCelular("098754612");
		Contacto c3 = new Contacto();
		c3.setNombre("Juana");
		c3.setCelular("055547896");
		Contacto c4 = new Contacto();
		c4.setNombre("Majo");
		c4.setCelular("023457896");

		dir.agreagarContacto(c1);
		dir.agreagarContacto(c2);
		dir.agreagarContacto(c3);
		dir.agreagarContacto(c4);

		// CORRECCIÓN: Usar el nombre de método correcto
		ArrayList<Contacto> encontrados = dir.buscarContactosCoincidencia("Te");

		// CORRECCIÓN: Quitar el ";" y usar llaves "{}"
		for (int i = 0; i < encontrados.size(); i++) {
			Contacto c = encontrados.get(i);
			System.out.println("Nombre: " + c.getNombre() + " | Celular: " + c.getCelular());
		}
	}
}