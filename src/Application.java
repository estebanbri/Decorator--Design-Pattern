import model.Cuenta;
import structural.component.ICuentaBancaria;
import structural.component.impl.CuentaCorriente;
import structural.decorator.impl.BlindajeDecorator;
import structural.decorator.impl.VipDecorator;

/**
 *  Ejemplo: viene un cliente a un banco para abrir una "cuenta bancaria", y el empleado le ofrecer agregarle "blindaje" a la misma
 */

public class Application {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1, "Esteban Briceño");

        ICuentaBancaria cuentaBlindada = new VipDecorator(new BlindajeDecorator(new CuentaCorriente()));
        cuentaBlindada.abrirCuenta(cuenta);
    }
}
