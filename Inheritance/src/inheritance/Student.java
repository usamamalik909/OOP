package inheritance;
public class Student {
    String name;
    int id;
    double gpa;

    public Student( int id, String name,double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public String getName()
    {
        return name;
    }
    public double getGpa()
    {
        return gpa;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    
    @Override
    public String toString()
    {
        return id  + " " + name + " " +gpa ;
    }
}