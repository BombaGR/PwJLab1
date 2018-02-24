import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SolutionCard
{
    List<Student> studentsList = new ArrayList<Student>();

    public void readKeyCard(String fileName)
    {
        Path sciezka = Paths.get(fileName);
        List<String> readList = new ArrayList<String>();
        String name = "Fuck";
        List<String> temporaryExam = new ArrayList<String>();
        try
        {
            readList = (ArrayList) Files.readAllLines(sciezka);
        }
        catch (IOException ex)
        {
            System.out.println("No file!");
        }

        for(String line : readList)
        {
            String [] l = line.split(",");
            for(int i=0;i<l.length;i++)
            {
                if(i==0)
                {
                    name = l[i];
                }
                else
                    temporaryExam.add(l[i]);
            }
            studentsList.add(new Student(name,temporaryExam));
            temporaryExam = new ArrayList<String>();
        }
    }
    public List<Student> getStudentsList()
    {
        return studentsList;
    }

    public void print()
    {
        for(int i = 0; i<studentsList.size();i++)
        {
            System.out.println(studentsList.get(i).name);
        }
    }

    public Student getStudent(int i)
    {
        return studentsList.get(i);
    }
}
