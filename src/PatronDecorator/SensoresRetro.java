/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorator;
import PatronBuilder.Vehiculo;

/**
 *
 * @author jjmg0
 */
public class SensoresRetro extends ComplementosDecorator {
    
    public SensoresRetro(Vehiculo c){
        super(c);
    }
    
    @Override
    public void implementar(ComplementosDecorator cd){
        super.implementar(cd);
        System.out.println("Agregado Sensor Retro");
    }
    
    public String toString(){
        return "Sensor Retro";
    }

    @Override
    public String getPrestaciones() {
        return "";
    }
}
