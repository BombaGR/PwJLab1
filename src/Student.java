
import java.util.ArrayList;
import java.util.List;

public class Student
{
    String name;
    List<String> solutionsList= new ArrayList<String>();
    int points;

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public float getPercent() {
        return percent;
    }

    public float getMark() {
        return mark;
    }

    float percent;
    float mark;

    public Student()
    {
        name = "Student";
        points = 0;
    }

    public Student(String name, List<String> ans)
    {
        this.name = name;
        this.solutionsList = ans;
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

    public void addPoint()
    {
        points++;
    }

    public int getPoints()
    {
        return points;
    }

    public String getName()
    {
        return name;
    }
}
