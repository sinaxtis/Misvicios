package com.Sinaxtis;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import misLecturas.*;

public class App 
{
	static Users usActive;
	static Users us1 = new Users("mike", "Mike", "DeAntoni");
	static Users us2 = new Users("cacho", "Cacho", "Gates");
	static Users us3 = new Users("mikel", "Mikel", "Pelochis");
	static Users us4 = new Users("raul", "Raul", "Gonzales");
	static Users us5 = new Users("tom", "Tom", "Bredy");
	static Users us6 = new Users("arodgers", "Aaron", "Rodgers");
	static ArrayList<Users> users = new ArrayList<Users>();
    public static void main( String[] args ) throws ExceptionMisvicios
    {
    	users.add(us1);
    	users.add(us2);
    	users.add(us3);
    	users.add(us4);
    	users.add(us5);
    	users.add(us6);
        BookState stateBook1 = new BookState(1, "Leido");
        BookState stateBook2 = new BookState(2, "Por Leer");
        Genere genereBook1 = new Genere(1, "Policial");
        Genere genereBook2 = new Genere(2, "Terror");
        Author aut1 = new Author("Julio", "Cortazar");
        Author aut2 = new Author("Miguel", "Cervantes");
        Author aut3 = new Author("Julio", "Asimov");
        Book book1 = new Book("Los hombres de la noche", aut1, stateBook1, genereBook1, 2);
        Book book2 = new Book("Las mujeres de la noche", aut3, stateBook2, genereBook2, 1);
        Book book3 = new Book("Los perros de la noche", aut2, stateBook1, genereBook1, 3);
        Book book4 = new Book("El dia que los perros conquistaron el mundo", aut1, stateBook2, genereBook2, 4);
        Book book5 = new Book("Una noche con Spiderman", aut3, stateBook1, genereBook2, 1);
        Book book6 = new Book("Pasión de sabado por la noche", aut2, stateBook2, genereBook1, 2);
        Book book7 = new Book("Charly y los pibes", aut1, stateBook1, genereBook2, 3);
        Book book8 = new Book("Medicina deportiva con River", aut1, stateBook2, genereBook2, 2);
        Book book9 = new Book("Barcelona o como sentir frio todo el año", aut3, stateBook1, genereBook1, 1);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        BookHistory bookList = new BookHistory(books);
        
        System.out.println(bookList.librosLeidos());
        System.out.println(bookList.librosPorLeer());
        System.out.println(bookList.seleccionCola());
        System.out.println(bookList.seleccionPila());
        System.out.println(bookList.duracionTotal((bookList.getBooks().size()-1)));
        
        try {
        	Scanner scnr = new Scanner(System.in);
            System.out.println("Presione 1 para ingresar sus credenciales de acceso");
            System.out.println("Presione 2 para crear credenciales de acceso");
            int rllnum=scnr.nextInt();
            rango(rllnum);
            switch(rllnum){
                case 1:
                    try {
            			if (login()){
            				System.out.println(usActive.getDatos());
            				System.out.println("Bienvenido");
            	            System.out.println("Presione 1 para ver su lista de libros leidos");
            	            System.out.println("Presione 2 para ver su lista de libros por leer");
            	            System.out.println("Presione 3 para obtener una recomendacion de lectura pila");
            	            System.out.println("Presione 4 para obtener una recomendacion de lectura cola");
            	            System.out.println("Presione 5 para obtener cantidad de tiempo de lectura restante (metodo recursivo)");
            	            int il=scnr.nextInt();
            	            rangoMenu(il);
            	            switch(il){
            	            	case 1:
            	            		System.out.println(bookList.librosLeidos());
            	            		break;
            	            	case 2:
            	            		System.out.println(bookList.librosPorLeer());
            	            		break;
            	            	case 3:
            	            		System.out.println(bookList.seleccionPila());
            	            		break;
            	            	case 4:
            	            		System.out.println(bookList.seleccionCola());
            	            		break;
            	            	case 5:
            	            		System.out.println(bookList.duracionTotal((bookList.getBooks().size()-1)));
            	            		break;
            	            }
            			}
            			else{
            				System.out.println("Hubo un problema con su login");
            			}
            		} catch (IOException e) {
            			System.out.print("Hubo un problema con su login");
            		
            		}
                    break;
                case 2:
                	try {
            			if (signup()){
            				System.out.println(usActive.getDatos());
            				System.out.println("Bienvenido");
            			}
            			else{
            				System.out.println("Hubo un problema en su registracion");
            			}
            		} catch (IOException e) {
            			System.out.print("Hubo un problema en su registracion");
            		
            		}
            }
        }
        catch (InputMismatchException e){
        	System.out.println("No ingrese letras");
        }
        // crear metodo de login
        // crear metodo de carga de datos
        // 1 Ver lista de libros leidos
        // 2 Ver lista de libros para leer cola
        // 3 Ver lista de libros para leer pila
        //System.out.println("Presione 2 para crear credenciales de acceso");
        // crear metodo de signup
        /*System.out.println("Ingrese su usuario");
        System.out.println(aut.getDatos());
        System.out.println(us1.getDatos());*/
        
    }
    public static boolean signup() throws IOException, ExceptionMisvicios{
    	InputStreamReader inpred=new InputStreamReader(System.in);
        BufferedReader bffr=new BufferedReader(inpred);
        boolean ocupado = true;
    	System.out.println("Ingrese su nombre: ");
    	String name = bffr.readLine();
    	if (name.isEmpty()){
    		throw new ExceptionMisvicios("Nombre vacio");
    	}
    	System.out.println("Ingrese su apellido: ");
    	String lastname = bffr.readLine();
    	if (lastname.isEmpty()){
    		throw new ExceptionMisvicios("Apellido vacio");
    	}
    	System.out.println("Ingrese su username: ");
    	String username = " ";
        while (ocupado == true){
        	ocupado = false;
            username = bffr.readLine();
            for (Users user: users){
               if(user.getUsername().compareTo(username) == 0){
                    ocupado = true;
                }
            }
            if(ocupado == true){
            	System.out.println("Ingrese otro username");
            }
        }
       Users usNew = new Users(username, name, lastname);
       users.add(usNew);
       usActive = usNew;
       return true;
    }
    public static boolean login() throws IOException{
    	InputStreamReader inpred=new InputStreamReader(System.in);
        BufferedReader bffr=new BufferedReader(inpred);
    	System.out.println("Ingrese su usuario");
    	String username = bffr.readLine();
    	
    	
    	for (Users user : users) {
    		if(user.getUsername().compareTo(username) == 0){
    			usActive = user;
    			return true;
    		}
    	}
    	return false;
    }
    static void rango(int num)throws ExceptionMisvicios{
        if((num<=0)||(num>3)){
            throw new ExceptionMisvicios("Números fuera de rango del menu");
        }
    }
    static void rangoMenu(int num)throws ExceptionMisvicios{
        if((num<=0)||(num>5)){
            throw new ExceptionMisvicios("Números fuera de rango del menu");
        }
    }
}
