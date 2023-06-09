package tallerRamos;

public class Vacation {
    String destination;
    int n_travel;
    int days;
    /**
	   *
	   * @return

	 */    
    public String getdestination() {
        return destination;
    }
    /**
	   *
	   * @return

	 */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    /**
	   *
	   * @return

	 */
    public int getN_travel() {
        return n_travel;
    }
    /**
	   *
	   * @return

	 */
    public void setN_travel(int n_travel) {
        this.n_travel = n_travel;
    }
    /**
	   *
	   * @return

	 */
    public int getDays() {
        return days;
    }
    /**
	   *
	   * @return

	 */
    public void setDays(int days) {
        this.days = days;
    }
    /**
	   *
	   * @return

	 */	
    public int costo_dest(int dest) {
        if(dest==1) {
            return 1600;
        }
        else if (dest==2) {
            return 1500;
        }
        else {
            return 1000;
        }
    }
    /**
	   *
	   * @return

	 */
    public double costo_travelers(int travels, int dest) {
        if(travels>4 && travels<10) {
            double descuento= costo_dest(dest)-(costo_dest(dest)*0.10);
            return descuento ;
        }
        else if(travels>=10) {
            double descuento= costo_dest(dest)-(costo_dest(dest)*0.20);
            return descuento ;
        }
        else{
            return costo_dest(dest);
        }
    }
     /**
 	   *
 	   * @return

 	 */
    public double costo_days(double costo_travelers, int days, int travels) {
        if(days<7) {
            double cost_day = costo_travelers +200;
            return cost_day;
        } else if (days >= 30 || travels >= 2) {
            int d = 200;
            double costday2 = costo_travelers - d;
            return costday2;
        } else {
            return costo_travelers;
        }
    }
    /**
 	   *
 	   * @return

 	 */
    
    public double costpack (int travels, int pack){
        if(pack == 1) {
           double costp = travels * 200;
           return costp;
       } else if (days == 2) {            
           double costp = travels *150;
           return costp;
       } else {
           double costp = travels *100;
           return costp ;
       }
       
   }
}
