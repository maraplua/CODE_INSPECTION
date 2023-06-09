// Copyright (C) 2020
// All rights reserved
package tallerRamos;
import java.util.Scanner;


/**
 * @author Ramos
 */

public final class Main {
	 /**
		   *
		   * @return

	  */

	// CHECKSTYLE: OFF
    public static void main(String[] args) {
	// CHECKSTYLE: ON
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. New York");
        System.out.println("2. París");
        System.out.println("3. Otros");
        String respuesta;
        int desti;
        do {
            System.out.println("select a destination of the vacation :");
            String dest = entrada.next();
            respuesta = dest;
            desti = Integer.parseInt(dest);
        } while (!respuesta.matches("[0-3]*"));
        System.out.println("Number of travelers :");
        String travel = entrada.next();
        int travels = Integer.parseInt(travel);
        System.out.println("Duration of the vacation in days :");
        String day = entrada.next();
        int days = Integer.parseInt(day);
        System.out.println("1. All-Inclusive $200 c/u");
        System.out.println("2. Adventure Activities $150 c/u");
        System.out.println("3. Spa and Wellness $100 c/u");
        System.out.println(" select a vacation package :");
        String pack = entrada.next();
        int packg = Integer.parseInt(pack);
        Vacation vacation = new Vacation();
        double c = vacation.costo_travelers(travels, desti);
        double t = vacation.costo_days(c, days, travels);
        double tp=vacation.costpack(travels, packg);
        double tt= tp+t;        
        System.out.println(tt);

    }

}
