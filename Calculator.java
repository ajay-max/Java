/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */ class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
           System.out.println("Enter 1st num");
           int num1=sc.nextInt();
           
             System.out.println("Enter 2nd Num");
             int num2=sc.nextInt();
        // TODO code application logic here
        
        while(true)
        {
          
            System.out.println("Press 1 to add,2 to substract,3 to divide, 4 to multiply and 5 for modulas");
            int x=sc.nextInt();
           
         
            switch(x)
             
            {
                case 1:int sum=num1+num2;
                    System.out.println("The Sum is :"+sum);
                break;
                case 2:int sub=num1-num2;
                    System.out.println("The Substraction is :"+sub);
                break;
                case 3:int div=num1/num2;
                    System.out.println("The division is :"+div);
                break;
                case 4:int mul=num1*num2;
                    System.out.println("The multiplication is :"+mul);
                break;
                case 5:int mod=num1%num2;
                    System.out.println("The modulous is :"+mod);
                break;
               
                    
            }   
              break;      
            }
           
          
        }
        
    }
    
    
    

    

