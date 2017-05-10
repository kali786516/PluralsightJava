package Beginner.JavaFundamentals.greetings;

import Beginner.JavaFundamentals.printing.*;

/**
 * Created by kalit_000 on 5/6/17.
 */
public class HelloWorld {

    public static void main(String[] args){

        Printer<ColorCartridge> colorprinter= new Printer<ColorCartridge>(true,"AZAlapocas_Printer",new ColorCartridge());
        colorprinter.loadPaper(5);
        colorprinter.print(1);

        Printer<BWCartridge> bwprinter= new Printer<BWCartridge>(true,"AZDeepakRoom_Printer",new BWCartridge());
        bwprinter.loadPaper(7);

        try
        {
            bwprinter.print(5);
            bwprinter.outputPage(3);
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println(exception.getMessage());

        }
        finally
        {
            bwprinter.TurnOff();
            System.exit(1);
        }

        colorprinter.printUsingCartridge(new ColorCartridge(),"Hi!");

        //machine.TurnOn();

        //Printer alapocas_printer=new Printer(true,"AZAlapocas_Printer");
        //Printer deepak_printer=new Printer(false,"Deepak_Printer");
        //alapocas_printer.loadPaper(5);
        //alapocas_printer.print(6);
        //alapocas_printer.print(100);
        //alapocas_printer.printColors();
        //alapocas_printer.TurnOff();
        //alapocas_printer.print(2);

    }
}
