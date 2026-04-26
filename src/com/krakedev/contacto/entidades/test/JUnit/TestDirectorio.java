package com.krakedev.contacto.entidades.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.krakedev.contacto.entidades.Contacto;
import com.krakedev.contacto.entidades.Directorio;

public class TestDirectorio {
	private Directorio directorio;

    @BeforeEach
    public void setUp() {
        directorio = new Directorio();
    }

    @Test
    public void testAgregarContactoNuevo() {
        // ¿Qué se prueba?
        // Se agrega un contacto que no existe en el directorio

        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");

        boolean resultado = directorio.agreagarContacto(c1);

        // Resultado esperado:
        // Debe retornar true porque el contacto es nuevo
        assertTrue(resultado);
    }

    @Test
    public void testAgregarContactoDuplicado() {
        // ¿Qué se prueba?
        // Se intenta agregar un contacto con un número ya existente

        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");

        Contacto c2 = new Contacto();
        c2.setNombre("Pedro");
        c2.setCelular("0991111111"); // mismo número

        directorio.agreagarContacto(c1);
        boolean resultado = directorio.agreagarContacto(c2);

        // Resultado esperado:
        // Debe retornar false porque el número ya existe
        assertFalse(resultado);
    }

    @Test
    public void testCantidadContactos() {
        // ¿Qué se prueba?
        // Verificar que el tamaño de la lista sea correcto

        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");

        Contacto c2 = new Contacto();
        c2.setNombre("Maria");
        c2.setCelular("0992222222");

        directorio.agreagarContacto(c1);
        directorio.agreagarContacto(c2);

        int cantidad = directorio.obtenerCantidadContacto();

        // Resultado esperado:
        // Debe haber 2 contactos en la lista
        assertEquals(2, cantidad);
    }

    @Test
    public void testNoAgregarDuplicadosEnLista() {
        // ¿Qué se prueba?
        // Verificar que no se agreguen contactos duplicados en la lista

        Contacto c1 = new Contacto();
        c1.setNombre("Juan");
        c1.setCelular("0991111111");

        Contacto c2 = new Contacto();
        c2.setNombre("Pedro");
        c2.setCelular("0991111111"); // duplicado

        directorio.agreagarContacto(c1);
        directorio.agreagarContacto(c2);

        int cantidad = directorio.obtenerCantidadContacto();

        // Resultado esperado:
        // Solo debe existir 1 contacto
        assertEquals(1, cantidad);
    }

}
