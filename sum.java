import java.util.Scanner;
class sum{  
 
   }  
   class Sum1{  
    public static void main(String args[]){  
        Scanner inpt = new Scanner(System.in);
     sum s1 = new sum(); 
     System.out.println("Enter two number for sum");
     System.out.print("Number1 =");  
     int n1 = inpt.nextInt();
     System.out.print("Number2 =");
     int n2 = inpt.nextInt();
     int sm = n1 + n2;
     System.out.println("The sum of these numbers is "+ sm);

    }  
   }  