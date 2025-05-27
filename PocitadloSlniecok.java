/**
 * Trieda vytvori plne automaticke pocitadlo bodov, za ktore si hrac vie nakupovat rastlinky
 * trieda bola inspirovana stvrtym tyzdnom
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class PocitadloSlniecok {
    private SSD prvePolicko;
    private SSD druhePolicko;
    private SSD tretiePolicko;
    private int pocet;
    /**
     * Konstruktor vytvori 3 SSD na potrebnej pozicii a zobrazi hodnotu 950
     */
    public PocitadloSlniecok() {
        this.prvePolicko = new SSD(250, 0);
        this.druhePolicko = new SSD(280, 0);
        this.tretiePolicko = new SSD(310, 0);
        this.pocet = 950;
        this.prepocitajSlniecka();
    }
    
    /**
     * Metoda prida k bodom dalsie body a novu hodnotu zobrazi
     * @param poceet je pocet bodov, ktore sa maju pripocitat k celkovemu poctu bodov
     */
    public void pridajSlniecka(int poceet) {
        this.pocet += poceet;
        this.prepocitajSlniecka();
    }
    
    /**
     * Metoda sluzi na prepisanie hodnot na pocitadle
     */
    public void prepocitajSlniecka() {
        int a = this.pocet % 10;
        int b = (this.pocet / 10) % 10; 
        int c = (this.pocet / 10) / 10;
        this.prvePolicko.vymaz();
        this.druhePolicko.vymaz();
        this.tretiePolicko.vymaz();
        this.prvePolicko = null;
        this.druhePolicko = null;
        this.tretiePolicko = null;
        this.prvePolicko = new SSD(250, 0);
        this.druhePolicko = new SSD(280, 0);
        this.tretiePolicko = new SSD(310, 0);
        this.tretiePolicko.zobraz(a);
        this.druhePolicko.zobraz(b);
        this.prvePolicko.zobraz(c);
    }
    
    /**
     * Metoda vrati aktualny pocet bodov
     */
    public int getPocet() {
        return this.pocet;
    }
}
