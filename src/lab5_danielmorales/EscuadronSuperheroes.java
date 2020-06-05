package lab5_danielmorales;

import java.util.ArrayList;

public class EscuadronSuperheroes {
    private String nombre;
    private String lugar;
    private String lider;
    private String tipo;
    private ArrayList miembros = new ArrayList();

    public EscuadronSuperheroes(String nombre, String lugar, String lider, String tipo, ArrayList miembros) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.lider = lider;
        this.tipo = tipo;
        setMiembros(miembros);
    }
    
    public EscuadronSuperheroes(String nombre, String lugar, String tipo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.tipo = tipo;
    }

    public EscuadronSuperheroes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
