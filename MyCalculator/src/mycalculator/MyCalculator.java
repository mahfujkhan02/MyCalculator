package mycalculator;

import java.util.Scanner;

public class MyCalculator extends Calculator
{
    public static void main(String[] args) 
    {
        double  a, b, result;
        
        Scanner sc = new Scanner(System.in);        
        MyCalculator abc = new MyCalculator();
                
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        result = abc.doAdd(a, b);
        System.out.println(result);        
    }    
}