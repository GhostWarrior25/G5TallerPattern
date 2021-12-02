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
public class RadioTactil extends ComplementosDecorator{
    
    public RadioTactil(Vehiculo c){
        super(c);
    }
    
    @Override
    public void implementar(ComplementosDecorator cd){
        super.implementar(cd);
        System.out.println("Agregada radio tactil");
    }
    
    public String toString(){
        return "RadioTactil";
    }

    @Override
    public String getPrestaciones() {
        return "";
    }
}
