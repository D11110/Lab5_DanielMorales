/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_danielmorales;

/**
 *
 * @author danie
 */
public class Superheroe {

    private String nombre;
    private String poder;
    private String debilidad;
    private Superheroe lider;
    private Escuadrones escuadron;
    private int fuerza;
    private int agilidadFisica;
    private int agilidadMental;

    public Superheroe() {
    }

    public Superheroe(String nombre, String poder, String debilidad, int fuerza, int agilidadFisica, int agilidadMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
    }

    public Superheroe(String nombre, String poder, String debilidad, Superheroe lider, int fuerza, int agilidadFisica, int agilidadMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.lider = lider;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
    }

    public Superheroe(String nombre, String poder, String debilidad, Escuadrones escuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
    }

    public Superheroe getLider() {
        return lider;
    }

    public void setLider(Superheroe lider) {
        this.lider = lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Escuadrones getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadrones escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public String getInfo() {
        return "Superheroe{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", lider=" + lider + ", escuadron=" + escuadron + ", fuerza=" + fuerza + ", agilidadFisica=" + agilidadFisica + ", agilidadMental=" + agilidadMental + '}';
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", poder=" + poder;
    }

}
