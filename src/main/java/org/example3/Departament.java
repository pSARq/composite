package org.example3;

import java.util.ArrayList;
import java.util.List;

public class Departament implements EmployeeDepartmentComponent {

    private final String name;
    private final List<EmployeeComponent> childComponents;

    public Departament(String name) {
        this.name = name;
        this.childComponents = new ArrayList<>();
    }


    @Override
    public void addEmployee(EmployeeComponent employeeComponent) {
        childComponents.add(employeeComponent);
    }

    @Override
    public void removeEmployee(EmployeeComponent employeeComponent) {
        childComponents.remove(employeeComponent);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Departamento: " + this.name);
        for (EmployeeComponent employeeComponent : childComponents) {
            employeeComponent.showEmployeeDetails();
        }
    }
}
