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
public class CamaraRetro extends ComplementosDecorator {
    
    public CamaraRetro(Vehiculo c){
        super(c);
    }
    
    @Override
    public void implementar(ComplementosDecorator cd){
        super.implementar(cd);
        System.out.println("Agregada camara retro");
    }
    
    public String toString(){
        return "CamaraRetro";
    }

    @Override
    public String getPrestaciones() {
        return "";
    }
}
