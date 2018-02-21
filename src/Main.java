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
        List<String> odp = ans.getKeyList();

        if(odp.get(1).equals(test.rightAnswer.get(0)))
        {
            System.out.println("Prawidlowo!");
        }
        else
            System.out.println("Nie!");
        /*for (int i =0;i<2;i++) {
            System.out.println(test.question.get(i));
            System.out.println(test.answers.get(i));
            System.out.println(test.rightAnswer.get(i));
        }*/
    }

}
