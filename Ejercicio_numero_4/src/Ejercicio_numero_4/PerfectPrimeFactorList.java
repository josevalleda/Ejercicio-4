package Ejercicio_numero_4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    

    public static void main(String[] args) {
        
        
        System.out.print("Introduzca el límite superior (entero positivo): ");
        Scanner in = new Scanner(System.in);
        if ( ! in.hasNextInt()) {
            System.out.println("El límite superior no es válido. vuelva a intentarlo.");
            return;
        }
        int limsup = in.nextInt();
        
        PerfectPrimeFactorList aPerfectPrimeFactorList = new PerfectPrimeFactorList();
        
        System.out.println(aPerfectPrimeFactorList.isProductOfPrimeFactors(30));
        System.out.println(aPerfectPrimeFactorList.isProductOfPrimeFactors(20));
        
        aPerfectPrimeFactorList.printPerfectPrimeFactors(limsup);
    }
    
    private boolean isPrime(int posInt)
    {
        for (int i = 2; i <= Math.sqrt(posInt); i++)
        {
            if (posInt%i != 0) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    private boolean isProductOfPrimeFactors(int pInt)
    {
        int p = 1;
        for (int i = 2; i < pInt; i++) {
            p *= isPrime(i) && (pInt%i == 0) ? i : 1;
        }
        return (p == pInt);
    }
    
    private void printPerfectPrimeFactors(int limsup)
    {
        System.out.println("Estos números son iguales al producto de factores primos: ");
        
        int countProductOfPrimeFactors = 0;
        for (int i = 1; i <= limsup; i++) {
            if (! isProductOfPrimeFactors(i)) {
                continue;
            }
            System.out.printf("%1$d ", i);
            countProductOfPrimeFactors++;
            
        }
        
        System.out.printf("[%1$d números encontrados (%2$.2f%%)]",
         countProductOfPrimeFactors, ((double) 100 * countProductOfPrimeFactors/limsup));
    }   
    }
    
//Jose David De la valle Acuña - 2015114083
//John Steven Rubio Castellanos - 2015214126

