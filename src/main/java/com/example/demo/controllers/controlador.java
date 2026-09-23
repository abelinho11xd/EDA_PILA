package com.example.demo.controllers;

import com.example.demo.estructura.pila;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pila")
public class controlador {

    // Instancia de tu pila para almacenar cadenas (o el tipo de dato que prefieras)
    private final pila<String> miPila = new pila<>();

    // 1. Agregar elemento: POST http://localhost:8080/api/pila/agregar?valor=Hola
   @GetMapping ("/agregar")
    public String agregar(@RequestParam String valor) {
        miPila.agregar(valor);
        return "Elemento '" + valor + "' agregado. Tamaño actual: " + miPila.size();
    }

    // 2. Quitar elemento: DELETE http://localhost:8080/api/pila/quitar
    @GetMapping("/quitar")
    public String quitar() {
        String eliminado = miPila.quitar();
        if (eliminado != null) {
            return "Elemento '" + eliminado + "' removido. Tamaño actual: " + miPila.size();
        }
        return "La pila está vacía.";
    }

    // 3. Obtener tamaño: GET http://localhost:8080/api/pila/size
    @GetMapping("/size")
    public int size() {
        return miPila.size();
    }

    // 4. Mostrar en consola del servidor: GET http://localhost:8080/api/pila/mostrar
    @GetMapping("/mostrar")
    public String mostrar() {
        miPila.mostrar();
        return "Pila impresa en la consola del servidor. Tamaño: " + miPila.size();
    }
}