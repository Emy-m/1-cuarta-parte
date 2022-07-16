package model;

public class Cliente extends Persona {
    private double credito;

    public Cliente(String nombre, String telefono, int edad)
    {
        super(nombre, telefono, edad);
    }

    public Cliente(String nombre, String telefono, int edad, double credito)
    {
        super(nombre, telefono, edad);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                "} " + super.toString();
    }
}
