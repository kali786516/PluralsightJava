package Beginner.JavaFundamentals.printing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kalit_000 on 5/6/17.
 */
public class Printer<T extends  ICartridge> implements IMachine {

    public String modelNumber;
    private PaperTray paperTray=new PaperTray();
    private Machiene machine;
    private T cartridge;// colour or black and white cartridge
    //private List<Page> pages=new ArrayList<Page>();
    private Map<Integer,Page> pageMap=new HashMap<Integer,Page>();

    private boolean isOn;

    public Printer(boolean isOn,String modelNumber,T cartridge){
        machine =new Machiene(isOn);
        this.modelNumber=modelNumber;
        this.cartridge=cartridge;
    }

    @Override
    public void TurnOn()
    {
        System.out.println("warming up the printer");
        machine.TurnOn();

    }


    public <U extends ICartridge> void printUsingCartridge(U cartridge,String message){
        System.out.println(cartridge.toString());
        System.out.println(message);
        System.out.print(cartridge.toString());
    }



    public void print(int copies)
    {
        if (copies < 0)
            throw new IllegalArgumentException("cant print less than 0 copies");

        System.out.println(cartridge.getFillPercentage());

        System.out.println(cartridge.toString());

        String onStatus="";
        if(machine.isOn)
            onStatus=" is On!";
        else
            onStatus=" is Off!";
        String textToPrint=modelNumber + onStatus;

        // intializer ; condition ; increment
        /*for(int i=0;i < copies ;i++){
            System.out.println(textToPrint);
        }*/
        int pagenumber=1;

        while ( copies > 0 && !paperTray.isEmpty() )
        {
            //System.out.println(textToPrint);
            //pages.add(new Page(textToPrint));
            //pagenumber ++;
            pageMap.put(pagenumber,new Page(textToPrint+":"+pagenumber));
            pagenumber ++;
            copies--;
            paperTray.usePage();
        }

        if(paperTray.isEmpty())
            System.out.println("Load more papers");
    }

    public void outputPage(int pagenumber){
        System.out.println(pageMap.get(pagenumber).getText());

    }

    /*
    public void outputPages(){
        for(Page currentPage: pages){
            System.out.println(currentPage.getText());
        }
    }*/


    public void printColors(){
        String[] colors=new String[] {"Red","Blue","Green","Yellow","Orange"};
        for(String currentcolour:colors){
            System.out.println(currentcolour);
         }
    }

    //overloading example two methods with same name but one accepts variables other doesnt
    public void print(String text){
        System.out.println(text);
    }


    public String getModelNumber()
    {
        return modelNumber;
    }

    public void loadPaper(int count){
        paperTray.addPaper(count);
    }

    @Override
    public void TurnOff()
    {
       isOn=false;
       System.out.println("Turn off printer");

    }

    @Override
    public boolean isOn(){
        return machine.isOn();
    }


}
