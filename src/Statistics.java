import java.util.List;

public class Statistics
{
    public void examine(List<String> rightAnswer, List<Student> studentsList, int maxPoints )
    {
        for(int i =0;i<studentsList.size();i++)
        {
            for(int j =0;j<rightAnswer.size();j++)
            {
                if(rightAnswer.get(j).equals(studentsList.get(i).solutionsList.get(j)))
                {
                    studentsList.get(i).addPoint();
                }
            }
        }

        for(int i = 0;i<studentsList.size();i++)
        {
            studentsList.get(i).setPercent((studentsList.get(i).getPoints()*100)/maxPoints);
            if(studentsList.get(i).getPercent()<50)
            {
                studentsList.get(i).setMark(2);
            }
            else if(studentsList.get(i).getPercent()<60)
            {
                studentsList.get(i).setMark(3);
            }
            else if(studentsList.get(i).getPercent()<70)
            {
                studentsList.get(i).setMark(3.5f);
            }
            else if(studentsList.get(i).getPercent()<80)
            {
                studentsList.get(i).setMark(4);
            }
            else if(studentsList.get(i).getPercent()<90)
            {
                studentsList.get(i).setMark(4.5f);
            }
            else if(studentsList.get(i).getPercent()<=100)
            {
                studentsList.get(i).setMark(5);
            }
        }
    }

    public void getResoults(int maxPoints, List<Student> studentList)
    {

    }
}
