import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class KeyCard
{
    List<String> keyList = new ArrayList<String>();

    public void readKeyCard(String fileName)
    {
        Path sciezka = Paths.get(fileName);
        try
        {
            keyList = (ArrayList) Files.readAllLines(sciezka);
        }
        catch (IOException ex)
        {
            System.out.println("No file!");
        }
    }

    public void print()
    {
        for(int i = 0; i<keyList.size();i++)
        {
            System.out.println(keyList.get(i));
        }
    }
}
