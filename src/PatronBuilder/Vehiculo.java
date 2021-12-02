/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuilder;
import PatronDecorator.Carro;
import PatronDecorator.ComplementosDecorator;
/**
 *
 * @author david_000
 */
public class Vehiculo implements Carro{
   public String color;
   public boolean direccionAsistida;
   public String marca;
   public String modelo;
   public IMotor motor;
   public Carroceria tipoCarroceria;
   public String n1 = "Prestaciones:\n";
   public String getPrestaciones(){
      
       n1 += "El presente vehículo es un " + marca + "\n";
       n1 += "Estilo " + tipoCarroceria.tipoCarroceria + "\n";
       n1 += "Color: " + color + "\n";
       n1 += (direccionAsistida ? "Con ":"Sin ") + "dirección asistida" + "\n";
       n1 += "Carrocería de " + tipoCarroceria.material + "\n";
       n1 += "Respuesta del motor: " + motor.InyectarCombustible(100) + "\n";
       
       return n1;
   }

   
    public void implementar(ComplementosDecorator cd) {
        String s = cd.toString();
        n1 += "Complementos: " +s+ "\n";
    }
    
}
