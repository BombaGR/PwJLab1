

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KeyCard
{
    public List<String> question;
    public List<String> answers;
    public List<String> rightAnswer;

    public KeyCard()
    {
        question = new ArrayList<String>();
        answers = new ArrayList<String>();
        rightAnswer = new ArrayList<String>();
    }

    public void readFromXmlFile(String xmlFileName)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {
            DocumentBuilder builder = factory.newDocumentBuilder();
            try
            {
                Document doc = builder.parse(xmlFileName);
                NodeList questionList = doc.getElementsByTagName("tresc");
                for(int i = 0; i<questionList.getLength();i++)
                {
                    Node qNode = questionList.item(i);
                    if(qNode.getNodeType() == Node.ELEMENT_NODE)
                    {
                        Element h = (Element)qNode;
                        question.add(h.getTextContent());
                    }
                }
                questionList = doc.getElementsByTagName("odpowiedzi");
                for(int i = 0; i<questionList.getLength();i++)
                {
                    Node qNode = questionList.item(i);
                    if(qNode.getNodeType() == Node.ELEMENT_NODE)
                    {
                        Element h = (Element)qNode;
                        answers.add(h.getTextContent());
                    }
                }
                questionList = doc.getElementsByTagName("prawidlowa");
                for(int i = 0; i<questionList.getLength();i++)
                {
                    Node qNode = questionList.item(i);
                    if(qNode.getNodeType() == Node.ELEMENT_NODE)
                    {
                        Element h = (Element)qNode;
                        rightAnswer.add(h.getTextContent());
                    }
                }
            } catch (SAXException e)
            {
                e.printStackTrace();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
    }

}
