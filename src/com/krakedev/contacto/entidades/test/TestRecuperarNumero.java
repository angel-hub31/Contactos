package com.krakedev.contacto.entidades.test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestRecuperarNumero {

	public static void main(String[] args) {
		Directorio dir =new Directorio();
		
		Contacto c1 =new Contacto();
		c1.setNombre("Maria"); //posicion 0
		c1.setCelular("123456789");
		Contacto c2 =new Contacto();
		c2.setNombre("Teresa");//posicion 1
		c2.setCelular("098754612");
		Contacto c3 =new Contacto();
		c3.setNombre("Juana");//posicion 2
		c3.setCelular("055547896");
		Contacto c4 =new Contacto();
		c4.setNombre("Pedro");//posicion 3
		c4.setCelular("023457896");
		dir.agreagarContacto(c1);//posicion 0
		dir.agreagarContacto(c2);//posicion 1
		dir.agreagarContacto(c3);//posicion 2
		dir.agreagarContacto(c4);//posicion 3
		
		String numeroRecuperado=dir.recuperarNumero(1);
		System.out.println("Celular: "+ numeroRecuperado);
		
	}

}
