/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Date;

/**
 *
 * @author anunez12
 */
public class Estudiante {

    private String nombre_completo;
    private long id; //numero de identificacion del estudiante 
    private String carrera;
    private Date fecha; // Tipo de dato que se utiliza para expresar la fecha total en dia/mes/año//  
    private ArrayList<Double> notas = new ArrayList<Double>();

    public Estudiante(String nombre_completo, long id, String carrera, Date fecha) {
        this.nombre_completo = nombre_completo;
        this.id = id;
        this.carrera = carrera;
        this.fecha = fecha;
    }

    public Estudiante(ArrayList notas) {
        this.notas = notas;
    }

    public ArrayList getNotas() {
        return notas;
    }

    public void setNotas(ArrayList notas) {
        this.notas = notas;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre_completo);
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + Objects.hashCode(this.carrera);
        hash = 37 * hash + Objects.hashCode(this.fecha);
        return hash;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre_completo=" + nombre_completo + ", id=" + id + ", carrera=" + carrera + ", fecha=" + fecha + ", notas=" + notas + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public void adiccionar_nota(double nota) {
        notas.add(nota);
    }

    public boolean buscar_nota(double nota) {
        return notas.contains(nota);
    }

    public boolean eliminar_nota(double nota) {
        return notas.remove(nota);
    }
   // metodos de notas 

    //Mayor nota del estudiante 
    public double Mayor_Nota() {

        double Mayor = notas.get(0);
        for (int i = 0; i < notas.size(); i++) {
            Double actual = notas.get(i);
            if (actual > Mayor) {
                Mayor = actual;

            }

        }
        return Mayor;
    }

    public double Menor_Nota() {

        double menor = notas.get(0);
        for (int i = 0; i < notas.size(); i++) {
            Double actual = notas.get(i);
            if (actual < menor) {
                menor = actual;

            }

        }
        return menor;
    }
  
}
  
