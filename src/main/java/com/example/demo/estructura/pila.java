package com.example.demo.estructura;

import java.util.Stack;

public class pila<T> {
    private Stack<T> elementos = new Stack<>();

    public void agregar(T elemento) {
        elementos.push(elemento);
    }

    public T quitar() {
        if (!elementos.isEmpty()) {
            return elementos.pop();
        }
        return null;
    }

    public void mostrar() {
        System.out.println(elementos);
    }

    public int size() {
        return elementos.size();
    }
}