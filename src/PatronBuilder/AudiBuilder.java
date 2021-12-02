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
public class AudiBuilder extends VehiculoBuilder{
    
    @Override
    public void definirVehiculo() {
        v = new Vehiculo();
        v.marca = "Audi";
        v.modelo = "A3 Sportsback";
        
    }

    @Override
    public void construirHabitaculo() {
        v.tipoCarroceria = new Carroceria();
        v.tipoCarroceria.tipoCarroceria = "deportivo";
        v.tipoCarroceria.habitaculoReforzado = false;
        v.tipoCarroceria.material= "fibra de carbono";
        v.color= "plata cromado";
    }

    @Override
    public void construirMotor() {
        v.motor = new MotorDiesel();
    }

    @Override
    public void definirAdicionales() {
       v.direccionAsistida = true;
    }
    
    @Override
    public String getPrestaciones(){
      return v.getPrestaciones();
   }
}
