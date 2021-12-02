/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuilder;

/**
 *
 * @author david_000
 */
public class Carroceria {

    public boolean habitaculoReforzado;
    public String tipoCarroceria;
    public String material;

    public boolean isHabitaculoReforzado() {
        return habitaculoReforzado;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public String getMaterial() {
        return material;
    }

    public void setHabitaculoReforzado(boolean habitaculoReforzado) {
        this.habitaculoReforzado = habitaculoReforzado;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
