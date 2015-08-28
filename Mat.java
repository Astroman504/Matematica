package matematica;

import java.util.Scanner;

/**
 *
 * @author Christhian
 */
public class Logic {
    -----------------------------------------------------------------------------------------------------
    \\este es el la tarea, esta separado ya que no entendi como era la idea de como hacerla, esta esta corregida
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
            return x + y;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
            return x - y;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
            return x * y;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		
            return x % y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
            if(x%2==0){
                return true;
            }else 
                return false;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
            if(x%3==0){
                return true;
            }else 
                return false;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
            if(x>y){
                return x;
            }else{ 
                return y;
                }
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
            if(edad>17){
                return true;
            }else 
                return false;
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
            if((x%2==0)&& (y%2==0)&&(z%2==0)){
                 return true;
            }else 
                return false;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
            return -1;
	}
    
    
    
    -----------------------------------------------------------------------------------------------------
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
    -----------------------------------------------------------------------------------------------------
    
    ----------------------------------------------------------------------------------------------------
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
