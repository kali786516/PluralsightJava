package Beginner.JavaFundamentals.printing;

/**
 * Created by kalit_000 on 5/6/17.
 */
public class PaperTray
{
    int pages = 0;

    public void addPaper(int count)
    {
        pages += count;
        System.out.println("Number of pages");
        System.out.println(pages);
    }

    public void usePage()
    {
        pages--;
    }

    public boolean isEmpty()
    {
        return pages <= 0;
    }
}

