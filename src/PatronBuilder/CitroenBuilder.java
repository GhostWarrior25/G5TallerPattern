/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuilder;

/**
 *
 * @author jjmg0
 */
public class CitroenBuilder extends VehiculoBuilder {

    @Override
    public void definirVehiculo() {
        v = new Vehiculo();
        v.marca = "Citroen";
        v.modelo = "XsaraPicasso";
        
    }

    @Override
    public void construirHabitaculo() {
        v.tipoCarroceria = new Carroceria();
        v.tipoCarroceria.tipoCarroceria = "monovolumen";
        v.tipoCarroceria.habitaculoReforzado = false;
        v.tipoCarroceria.material= "acero";
        v.color= "negro";
    }

    @Override
    public void construirMotor() {
        v.motor = new MotorDiesel();
    }

    @Override
    public void definirAdicionales() {
       v.direccionAsistida = false;
    }

    @Override
    public String getPrestaciones() {
        return v.getPrestaciones();
    }
}
