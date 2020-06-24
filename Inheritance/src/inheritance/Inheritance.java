
package inheritance;


public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Student a;
     Undergrad b;
     Graduate c;
     a= new Student(1,"Usama",2.99);
     a.setName("Taimoor");
     a.toString();
     System.out.println(a);
     b = new Undergrad(a.getId(),"Usama",2.99,2010);
     b.toString();
     System.out.println(b);
     c = new Graduate(1,"Usama",2.99,"Corona Virus");
     c.toString();
     System.out.println(c);
     
     
        
   
        
        
        
        
    }
    
}
