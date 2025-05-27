import fri.shapesge.Obdlznik;
/**
 * Trieda vytvori 1 policko sedem segmentovoho displeja s potrebym poctom segmentov
 * trieda bola inspirovana stvrtym tyzdnom
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class SSD  {
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;
    private Obdlznik pozadie;
    /**
     * Konstruktor vytvori pozadie a 7 segmentov. To vsetko nastavi 
     * na potrebne pozicie
     * @param x sluzi ako suradnica na vytvorenie SSD na potrebnom mieste
     * @param y sluzi ako suradnica na vytvorenie SSD na potrebnom mieste
     */
    public SSD(int x, int y) {
        this.pozadie = new Obdlznik();
        this.pozadie.zmenStrany(30, 50);
        this.pozadie.zmenFarbu("Black");
        this.pozadie.posunVodorovne(x - 60);
        this.pozadie.posunZvisle(y - 50);
        this.pozadie.zobraz();
        this.segmentA = new Segment(x + 6, y + 2, true);
        this.segmentB = new Segment(x + 24, y + 7, false);
        this.segmentC = new Segment(x + 24, y + 27, false);
        this.segmentD = new Segment(x + 6, y + 42, true);
        this.segmentE = new Segment(x + 2, y + 27, false);
        this.segmentF = new Segment(x + 2, y + 7, false);
        this.segmentG = new Segment(x + 6, y + 22, true);
    }
    
    /**
     * Metoda sluzi na zobrazenie zadaneho cisla na SSD
     * @param c cislo, ktore chceme zobrazit
     */
    public void zobraz(int c) {
        switch (c) {
            case 0:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.zapni();
                this.segmentF.zapni();
                this.segmentG.vypni();
                break;
            case 1:
                this.segmentA.vypni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.vypni();
                this.segmentE.vypni();
                this.segmentF.vypni();
                this.segmentG.vypni();
                break;
            case 2:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.vypni();
                this.segmentD.zapni();
                this.segmentE.zapni();
                this.segmentF.vypni();
                this.segmentG.zapni();
                break;
            case 3:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.vypni();
                this.segmentF.vypni();
                this.segmentG.zapni();
                break;
            case 4:
                this.segmentA.vypni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.vypni();
                this.segmentE.vypni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
            case 5:
                this.segmentA.zapni();
                this.segmentB.vypni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.vypni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
            case 6:
                this.segmentA.zapni();
                this.segmentB.vypni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.zapni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
            case 7:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.vypni();
                this.segmentE.vypni();
                this.segmentF.vypni();
                this.segmentG.vypni();
                break;
            case 8:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.zapni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
            case 9:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.vypni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
        }    
    }
    
    /**
     * Metoda vymaze dane SSD
     */
    public void vymaz() {
        this.segmentA.vypni();
        this.segmentB.vypni();
        this.segmentC.vypni();
        this.segmentD.vypni();
        this.segmentE.vypni();
        this.segmentF.vypni();
        this.segmentG.vypni();
        
        this.segmentA = null;
        this.segmentB = null;
        this.segmentC = null;
        this.segmentD = null;
        this.segmentE = null;
        this.segmentF = null;
        this.segmentG = null;
        this.pozadie.skry();
        this.pozadie = null;
    }
}
