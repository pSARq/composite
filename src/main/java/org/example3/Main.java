package org.example3;

public class Main {
    public static void main(String[] args) {
        EmployeeComponent employee1 = new Employee("Empleado 1", "Desarrollador");
        EmployeeComponent employee2 = new Employee("Empleado 2", "QA");
        EmployeeComponent employee3 = new Employee("Empleado 3", "Arquitecto");

        EmployeeDepartmentComponent developDepartament = new Departament("Departamento de desarrollo");
        developDepartament.addEmployee(employee1);
        developDepartament.addEmployee(employee3);

        EmployeeDepartmentComponent testDepartament = new Departament("Departamento de pruebas");
        testDepartament.addEmployee(employee2);

        EmployeeDepartmentComponent mainDepartament = new Departament("Departamento principal");
        mainDepartament.addEmployee(developDepartament);
        mainDepartament.addEmployee(testDepartament);

        mainDepartament.showEmployeeDetails();

    }
}
