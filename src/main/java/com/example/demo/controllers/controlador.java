package com.example.demo.controllers;

import com.example.demo.estructura.pila;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pila")
public class controlador {
    private final pila<String> miPila = new pila<>();
   @GetMapping ("/agregar")
    public String agregar(@RequestParam String valor) {
        miPila.agregar(valor);
        return "Elemento '" + valor + "' agregado. Tamaño actual: " + miPila.size();
    }
    @GetMapping("/quitar")
    public String quitar() {
        String eliminado = miPila.quitar();
        if (eliminado != null) {
            return "Elemento '" + eliminado + "' removido. Tamaño actual: " + miPila.size();
        }
        return "La pila está vacía.";
    }
    @GetMapping("/size")
    public int size() {
        return miPila.size();
    }
    @GetMapping("/mostrar")
    public String mostrar() {
        miPila.mostrar();
        return "Pila impresa en la consola del servidor. Tamaño: " + miPila.size();
    }
}