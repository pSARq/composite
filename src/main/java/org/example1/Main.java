package org.example1;

public class Main {
    public static void main(String[] args) {
        /*Este patron de diseño busca crear una estructura de arbol que permita manejarse todo
        con un mismo objeto para facilitar su manejo.
        Aunque como se ve en este ejemplo se rompe el principio SOLID #5 (Dependency Inversion)
        al momento de crear la clase controladora la crea directamente desde Composite.
        En el ejemplo 2 planteo este mismo ejemplo pero con una mejora para evitar que rompa ese
        principio aunque no estoy seguro si se llegue a presentar algún inconveniente
        con esa solución*/
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.add(leaf1);
        composite1.add(composite2);
        composite2.add(leaf2);

        composite1.operation();

    }
}