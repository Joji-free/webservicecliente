package com.anderson.webserviclientece;

import org.anderson.servicioweb.services.Curso;
import org.anderson.servicioweb.services.ServicioWs;
import org.anderson.servicioweb.services.ServicioWsImplementService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creamos el objeto Servicio Web
        ServicioWs service = new ServicioWsImplementService(). getServicioWsImplementPort();
        //Imprimimos en consola el saludo
        System.out.println("saludo: "+ service.saludar("Anderson Soto"));
        //Inicializamos el objeto curso
        Curso curso = new Curso();
        //Aniadimos
        curso.setNombre("JavaScript");
        Curso respuesta = service.crear(curso);

        //Imprimimos el nuevo curso aniadindo
        System.out.println("Nuevo Curso: "+ curso.getNombre());
        //Listamos los cursos
        service.listar().forEach (c -> System.out.println(c.getNombre()));
    }
}