import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SolutionCard
{
    List<String> keyList = new ArrayList<String>();

    public void readKeyCard(String fileName)
    {
        Path sciezka = Paths.get(fileName);
        List<String> readList = new ArrayList<String>();
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
            keyList.add(l[0]);
            keyList.add(l[1]);
        }
    }
    public List<String> getKeyList()
    {
        return keyList;
    }

    public void print()
    {
        for(int i = 0; i<keyList.size();i++)
        {
            System.out.println(keyList.get(i));
        }
    }
}
