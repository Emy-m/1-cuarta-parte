package main;

import model.Cliente;
import model.Trabajador;

public class Main {
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente("Emilio", "123456", 20, 100);
        Trabajador trabajador = new Trabajador("Martin", "123456", 20, 100);
        System.out.println(cliente);
        System.out.println(trabajador);
    }
}
