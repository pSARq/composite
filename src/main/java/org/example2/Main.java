package org.example2;


public class Main {
    public static void main(String[] args) {
        /*Asi ya no se depende de directamente de una clase sino que de una interfaz y esta a su vez se puede
        * seguir manejando como un objeto de Component porque la interfaz CompositeComponent extiende de la primera*/
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();

        CompositeComponent composite1 = new Composite();
        CompositeComponent composite2 = new Composite();

        composite1.add(leaf1);
        composite1.add(composite2);
        composite2.add(leaf2);

        composite1.operation();

    }
}