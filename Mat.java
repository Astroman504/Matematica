package matematica;

import java.util.Scanner;

/**
 *
 * @author Christhian
 */
public class Logic {
    
    public static double sumar(double x, double y){
        double res = x+y;
        return res;
	}
    public static double resta(double x, double y){
        double res = x-y;
        return res;
    }
    public static double multi(double x, double y){
        double res = x*y;
        return res;
    }
    public static double divi(double x, double y){
        double res = x%y;
        return res;
    }
     public static double mod(double x, double y){
        double res = x/y;
        return res;
    }
    public static boolean espar1(double x){
        double res = x;
        if (res%2==0){
        return true;
        }else{
            return false;
		}
    }

    public static boolean esMultiploDe3(double x){	
        if(x%3==0){
            return true;
        }else{
            return false;
        }
    }
    public static double getMayor(double x,double y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static double getMenor(double x,double y){
        if(x<y){
            return x;
        }else{
            return y;
        }
    }
    public static double getMayorde3(double x,double y,double z){
        if(x>y && x>z){
            return x;
        }else if(y>x && y>z){
            return y;
        }else if(z>x && z>y){
            return z;
        }
        return 0;
    }
    public static void print(){
    Scanner lea = new Scanner(System.in);
       double x = lea.nextDouble();
       double y = lea.nextDouble();
       double z = lea.nextDouble();
       System.out.println("Suma: "+Logic.sumar(x, y));
       System.out.println("Resta: "+Logic.resta(x, y));
       System.out.println("Multiplicacion: "+Logic.multi(x, y));
       System.out.println("Division: "+Logic.divi(x, y));
       System.out.println( "Modulo: "+Logic.mod(x, y));
       System.out.println( "Sera par?: "+Logic.espar1(x));
       System.out.println( "Sera par? "+Logic.espar1(y));
       System.out.println( "Sera Multiplo de 3? "+Logic.esMultiploDe3(x));
       System.out.println( "Sera Multiplo de 3? "+Logic.esMultiploDe3(y));
       System.out.println("El numero mayor es: "+Logic.getMayor(x, y));
       System.out.println("El numero menor es: "+Logic.getMenor(x, y));
       System.out.println("Numero mayor de los tres ingresados: "+Logic.getMayorde3(x, y, z));
       
    }
    }
