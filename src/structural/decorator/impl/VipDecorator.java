package structural.decorator.impl;

import model.Cuenta;
import structural.component.ICuentaBancaria;
import structural.decorator.CuentaDecorador;

public class VipDecorator extends CuentaDecorador {

    public VipDecorator(ICuentaBancaria cuentaASerDecorada) {
        super(cuentaASerDecorada); // Pasamos la referencia al objeto que implementa una clase concreta (CuentaAhorro/CuentaCorriente) de ICuentaBancaria al constructor de la clase padre CuentaDecorador
    }

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        super.abrirCuenta(cuenta);
        agregarVip(cuenta);  // Nueva funcionalidad
    }

    public void agregarVip(Cuenta cuenta){
        System.out.println("++ Funcionalidad Agregada: vip a la cuenta del cliente " + cuenta.getNombre());
    }
}
