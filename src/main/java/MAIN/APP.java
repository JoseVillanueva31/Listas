package MAIN;

import MAIN.DTO.*;

import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        boolean si;
        boolean no;
        si=true;
        no=false;


        Profesor P = new Profesor();
        Profesor A = new Profesor();
        Scanner scr = new Scanner(System.in);

        System.out.println("EL oficio es: " + P.getOficio());
        P.setRut("20405450-7");
        System.out.println("Rut: " + P.getRut());
        P.setEdad(35);
        System.out.println("Edad: " + P.getEdad());
        System.out.println("Una pregunta....");
        System.out.print("es convicto?: ");
        scr.nextLine();
        if(si){
            System.out.println("Seras arrestado...");
        }
        if(no){
            System.out.println("LIBERTAD..");
        }

    }


}
