package structural.decorator;

import model.Cuenta;
import structural.component.ICuentaBancaria;

public abstract class CuentaDecorador implements ICuentaBancaria {

    ICuentaBancaria cuentaAserDecorada;

    // Puede recibir cualquier implementacion de ICuentaBancaria (Ej: CuentaAhorro, CuentaCorriente)
    public CuentaDecorador(ICuentaBancaria cuentaAserDecorada){
        this.cuentaAserDecorada = cuentaAserDecorada;
    }

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        cuentaAserDecorada.abrirCuenta(cuenta); // Este abrir cuenta va a correr el codigo dependiendo de la implementacion que le hayas pasado como parametro al constructor
    }
}
