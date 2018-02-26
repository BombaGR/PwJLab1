
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentuje studenta: jego odpowiedzi, punkty, ocene
 */
public class Student
{
    private String name;
    private List<String> solutionsList= new ArrayList<String>();
    private int points;
    private float percent;
    private float mark;

    /**
     * Konstruktor klasy.
     */
    public Student()
    {
        name = "Student";
        points = 0;
    }

    /**
     * Konstruktor klasy.
     * @param name imie i nazwisko studenta
     * @param ans odpowiedzi udzielone przez studenta
     */
    public Student(String name, List<String> ans)
    {
        this.name = name;
        this.solutionsList = ans;
    }

    /**
     * Metoda dodająca do listy odpowiedzi nową odpowiedź.
     * @param solution treść odpowiedzi
     */
    public void addSolution(String solution)
    {
        solutionsList.add(solution);
    }

    /**
     * Metoda zwraca Listę odpowiedzi udzielonych przez studenta.
     * @return ArrayList
     */
    public List<String> getSolutionsList()
    {
        return solutionsList;
    }

    /**
     * Metoda zwraca rozwiązanie o podanym indeksie.
     * @param index
     * @return String
     */
    public String getSolution(int index)
    {
        return solutionsList.get(index);
    }

    /**
     * Metoda ustawia imię i nazwisko studenta.
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Metoda dodaje punkt.
     */
    public void addPoint()
    {
        points++;
    }

    /**
     * metoda zwraca punkty zdobyte przez studenta.
     * @return int
     */
    public int getPoints()
    {
        return points;
    }

    /**
     * Metoda zwraca imie i nazwisko studenta.
     * @return String
     */
    public String getName()
    {
        return name;
    }

    /**
     * Metoda ustawia wynik procentowy studenta.
     * @param percent float
     */
    public void setPercent(float percent)
    {
        this.percent = percent;
    }

    /**
     * Metoda ustawia ocenę zdobytą przez studenta.
     * @param mark float
     */
    public void setMark(float mark)
    {
        this.mark = mark;
    }

    /**
     * Metoda zwraca wynik procentowy Studenta.
     * @return float
     */
    public float getPercent()
    {
        return percent;
    }

    /**
     * Metoda zwraca Ocenę uzyskaną przez studenta.
     * @return float
     */
    public float getMark()
    {
        return mark;
    }

}
