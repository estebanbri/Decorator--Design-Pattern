package structural.decorator.impl;

import model.Cuenta;
import structural.component.ICuentaBancaria;
import structural.decorator.CuentaDecorador;

public class BlindajeDecorator extends CuentaDecorador {

    public BlindajeDecorator(ICuentaBancaria cuentaASerDecorada) {
        super(cuentaASerDecorada);  // Pasamos la referencia al objeto que implementa una clase concreta (CuentaAhorro/CuentaCorriente) de ICuentaBancaria al constructor de la clase padre CuentaDecorador
    }

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        super.abrirCuenta(cuenta);
        agregarBlindaje(cuenta); // Nueva funcionalidad
    }

    public void agregarBlindaje(Cuenta cuenta){
        System.out.println("++ Funcionalidad Agregada: blindaje a la cuenta del cliente " + cuenta.getNombre());
    }
}
