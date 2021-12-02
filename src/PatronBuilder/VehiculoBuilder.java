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
public abstract class VehiculoBuilder {
    protected Vehiculo v;
    
    public Vehiculo GetVehiculo(){
        return v;
    }
    
    public abstract void definirVehiculo();
    public abstract void construirHabitaculo();
    public abstract void construirMotor();
    public abstract void definirAdicionales();
    public abstract String getPrestaciones();
}
