
package inheritance;


public class Undergrad extends Student {
    private int year;

    public Undergrad( int id, String name, double gpa,int year) {
        super(id, name, gpa);
        this.year = year;
    }
    public void setyear(int newyear)
    {
        year=newyear;  
    }
    public int getyear()
    {
        return year;
    }
   
    @Override
    public String toString()
    {
        return id  + " " + name + " " +gpa+ " " +year ;
    }
}
