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


        ans.print();
        System.out.println(ans.getStudentsList().get(0).getSolution(1));
    }

}
