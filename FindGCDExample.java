/*Greatest Common Divisor: It is the highest number that completely divides two or more numbers.
  It is abbreviated for GCD. It is also known as the Greatest Common Factor (GCF)
  and the Highest Common Factor (HCF). */
public class FindGCDExample {
 public static void main(String[] args)   
 {  
  int n1=50, n2=60;  
  while(n1!=n2)   
  {  
   if(n1>n2)  
     n1=n1-n2;  
   else  
     n2=n2-n1;  
  }  
    System.out.printf("GCD of n1 and n2 is: " +n2);  
 } 
}
