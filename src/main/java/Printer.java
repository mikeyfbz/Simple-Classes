public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getNumberOfSheets(){
        return this.sheets;
    }

    public boolean canPrint(int pages, int copies){
        return (this.sheets > (pages * copies));
    }

    public int print(int pages, int copies){
        if(this.canPrint(pages, copies)){
            this.sheets -= (pages * copies);
        }
        this.reduceToner(pages);
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public int reduceToner(int pages){
        return (this.toner -= pages);
    }
}
