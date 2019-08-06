package structural.component.impl;

import model.Cuenta;
import structural.component.ICuentaBancaria;

public class CuentaCorriente implements ICuentaBancaria {

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("------FUNCIONALIDAD BASE-------");
        System.out.println("Se abrio una cuenta de Corriente");
        System.out.println("Cliente: " + cuenta.getNombre());
        System.out.println("-------------------------------");
    }

}
