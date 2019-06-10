import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void thePrinterHasSheets(){
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void thePrinterHasEnoughSheetsToPrint(){
        assertEquals(true, printer.canPrint(3,10));
    }

    @Test
    public void thePrinterDoesNotHaveEnoughSheetsToPrint(){
        assertEquals(false, printer.canPrint(15, 10));
    }

    @Test
    public void theNumberOfSheetsGetsReducedWhenPrintingHappens(){
        assertEquals(50, printer.print(5,10));
    }

    @Test
    public void thePrinterHasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void theTonerAmountIsReducedByTheNumberOfPages(){
        assertEquals(80, printer.print(20,1));
    }

}
