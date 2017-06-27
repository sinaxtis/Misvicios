package com.Sinaxtis;


import java.util.ArrayList;

import misLecturas.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("dfasdfasd");
        // recursivo para las pilas o las colas
        // poliformismo
        // crear excepciones y uso de las existentes
        // 28/06 a las 16:30 wilki 26 a las 18
        //
        Book libro = new Book();
        libro.setTitle("title");
        ArrayList<Author> authors = new ArrayList<Author>();
        Author aut = new Author();
        aut.setName("Julio"); //cambiar para solo tener un autor por libro
        aut.setLastname("Cortaza");
        authors.add(aut);
        libro.setAuthors(authors);
    }
}
