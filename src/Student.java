
import java.util.ArrayList;
import java.util.List;

public class Student
{
    String name;
    List<String> solutionsList= new ArrayList<String>();

    public Student()
    {
        name = "Student";
    }

    public void addSolution(String solution)
    {
        solutionsList.add(solution);
    }

    public List<String> getSolutionsList()
    {
        return solutionsList;
    }

    public String getSolution(int index)
    {
        return solutionsList.get(index);
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
