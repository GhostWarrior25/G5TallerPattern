/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorator;

/**
 *
 * @author jjmg0
 */
public interface Carro {

    public void implementar(ComplementosDecorator cd);
    public String getPrestaciones();
}
