/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author Miguel Lozano
 */
public class Coche {
    private Persona persona;
    private String lugar;

    public Coche() {
    }

    public Coche(Persona persona, String lugar) {
        this.persona = persona;
        this.lugar = lugar;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Coche{" + "persona=" + persona + ", lugar=" + lugar + '}';
    }
}


