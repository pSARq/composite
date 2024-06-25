package org.example3;

public class Employee implements EmployeeComponent {

    private final String name;
    private final String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Empleado: " + this.name + ", Posición: " + this.position);
    }
}
