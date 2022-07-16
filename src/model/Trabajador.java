package model;

public class Trabajador extends Persona {
    private double salario;

    public Trabajador(String nombre, String telefono, int edad) {
        super(nombre, telefono, edad);
    }

    public Trabajador(String nombre, String telefono, int edad, double salario) {
        super(nombre, telefono, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
