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
public abstract class ComplementosDecorator implements Carro {
    protected Carro c;
    public ComplementosDecorator(Vehiculo c){
        this.c = c;
    }
    
    @Override
    public void implementar(ComplementosDecorator cd){
        this.c.implementar(cd);
        
    }
    
    @Override
    public abstract String toString();
}
