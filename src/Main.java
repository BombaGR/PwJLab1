import org.jdom.JDOMException;
import java.io.IOException;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws JDOMException, IOException {
        KeyCard test = new KeyCard();
        SolutionCard ans = new SolutionCard();
        ans.readKeyCard("dane.csv");
        test.readFromXmlFile("pytania.xml");
        Statistics st = new Statistics();

        st.examine(test.rightAnswer,ans.studentsList,2);

        for(int i = 0;i<ans.studentsList.size();i++)
        {
            System.out.println(ans.getStudent(i).name + " Punktów: "+ ans.studentsList.get(i).getPoints()+"\n Ocena: "+ ans.studentsList.get(i).getMark()+"\n Procenty: "+ ans.studentsList.get(i).getPercent() );
            //System.out.println(ans.getStudent(i).getSolutionsList().get(0)+" "+ans.getStudent(i).getSolutionsList().get(1));
        }
    }

}
