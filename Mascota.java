package com.example.mascotas;

public class Mascota {
    private int foto;
    private String nombre;
    private int raiting;

    public Mascota(int foto, String nombre, int raiting) {
        this.foto = foto;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public int getFoto() { return foto; }
    public String getNombre() { return nombre; }
    public int getRaiting() { return raiting; }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
