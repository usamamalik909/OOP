
package inheritance;


public class Graduate extends Student {
    private String thesisTitle;

    public Graduate( int id, String name, double gpa,String thesisTitle) {
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;
    }
    public void setThesisTitle(String newthesisTitle)
    {
        thesisTitle = newthesisTitle;
    }
    public String getThesisTitle()
    {
        return thesisTitle;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        return id  + " " + name + " " +gpa+ " " +thesisTitle;
    }
}
