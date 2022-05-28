/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.libro;

/**
 *
 * @author developer
 */
public class Libro {

    //CREACION DE VARIABLES
  public static String Titulo;
  public static String Autor;
  public static String Editorial;
  public static String Estado;
  public static String Genero;
  public static int Volumen;
  
  //METODO CONSTRUCTOR

    public Libro() {
    }
  
    //METODOS GET Y SET

    public static String getTitulo() {
        return Titulo;
    }

    public static void setTitulo(String Titulo) {
        Libro.Titulo = Titulo;
    }

    public static String getAutor() {
        return Autor;
    }

    public static void setAutor(String Autor) {
        Libro.Autor = Autor;
    }

    public static String getEditorial() {
        return Editorial;
    }

    public static void setEditorial(String Editorial) {
        Libro.Editorial = Editorial;
    }

    public static String getEstado() {
        return Estado;
    }

    public static void setEstado(String Estado) {
        Libro.Estado = Estado;
    }

    public static String getGenero() {
        return Genero;
    }

    public static void setGenero(String Genero) {
        Libro.Genero = Genero;
    }

    public static int getVolumen() {
        return Volumen;
    }

    public static void setVolumen(int Volumen) {
        Libro.Volumen = Volumen;
    }

    
} 