package com.clientes;

import com.clases.BeneficiosCovid19;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code her

        /**
         * Crear 2 lista de beneficios para clientes Lista 1 y Lista 2 por ejemplo
         * Ejemplo:
         * id:12121
         * nombre: Beneficiados que perdieron su trabajo por COVID19
         * valorSubsidio: 150000
         *
         * Ejemplo:
         * id:895656
         * Nombre: Beneficios para persona tercera edad dagnificados COVID
         * valorSubsidio:200000
         */

    	Scanner scanner = new Scanner(System.in);

        System.out.println("Lista Uno\n" + "Ingrese Nombre del beneficio 1: ");
        String nombrebeneficio1 = scanner.nextLine();
        
        System.out.println("Ingrese Valor Subsidio: ");
        String valorbeneficio1 = scanner.nextLine();
        
        System.out.println("Lista Dos \n" + "Ingrese el nombre del beneficio 2: ");
        String nombrebeneficio2 = scanner.nextLine();
        
        System.out.println("Ingrese el valor: ");
        String valorbeneficio2 = scanner.nextLine();

        BeneficiosCovid19 Beneficio1 = new BeneficiosCovid19(); // se crea beneficio 1 de tipo BeneficiosCovid19
        List<BeneficiosCovid19> covidBenefit1 = new ArrayList<>(); // para recibir de cualquier tipo se crea List Beneficio1 = new ArrayList();
        Beneficio1.setId(getIdBeneficio()); // asigna id a lista1
        Beneficio1.setNombre(nombrebeneficio1); // asigna nombre a lista1
        Beneficio1.setValorSubsidio(valorbeneficio1);
        covidBenefit1.add(Beneficio1);

        BeneficiosCovid19 Beneficio2 = new BeneficiosCovid19(); // se crea beneficio 2 de tipo BeneficiosCovid19
        List<BeneficiosCovid19> covidBenefit2 = new ArrayList<>();
        Beneficio2.setId(getIdBeneficio());
        Beneficio2.setNombre(nombrebeneficio2); // asigna id a lista2
        Beneficio2.setValorSubsidio(valorbeneficio2); // asigna nombre a lista2
        covidBenefit2.add(Beneficio2);

        obtenerMejorBeneficio(covidBenefit1, covidBenefit2);

    }
    
    //Implementa un metodo que te entregue un numero aletorio para el ide de los beneficios usar el wrapper de Integer
    private static String getIdBeneficio(){
        //La Clase Math tiene varios metodos que te ayudaran
        return String.valueOf((int)Math.floor(Math.random()*(00001-(99999))+(99999)));
    }
    
    /**
     * Implementa un metodo que entregue un reporte de comparacion de las 2 listas este metodo solo imprimira regiostros
     * Cuando un metodo no retorna un tipo de datos se trabaja con la palabra clave VOID
     * Abarcar los operadores terniarios para condiciones logicas
     * Operadores logicos
     * Operacionres aritmeticos
     **/
    
    public static void obtenerMejorBeneficio(List<BeneficiosCovid19> beneficio1, List<BeneficiosCovid19> beneficio2) {
        BeneficiosCovid19 bestBeneficio = new BeneficiosCovid19();
        Float solucion = 0F;
        Float vlrSubsidio = 0F;
        String id = "";
        String nombre = "";

        solucion = bestBeneficio.getMejorbeneficios(beneficio1.get(0).getValorSubsidio().toString(), beneficio2.get(0).getValorSubsidio().toString());

        if (solucion.equals(beneficio1.get(0).getValorSubsidio())){
            id = beneficio1.get(0).getId();
            nombre = beneficio1.get(0).getNombre();
            vlrSubsidio = beneficio1.get(0).getValorSubsidio();
        }else{
            id = beneficio2.get(0).getId();
            nombre = beneficio2.get(0).getNombre();
            vlrSubsidio = beneficio2.get(0).getValorSubsidio();
        }

        System.out.println("El Mejor Beneficio Es: \n" + "Id : " + id + "\nNombre: " + nombre + "\nValor Subsidio: " + vlrSubsidio);
    }
}
