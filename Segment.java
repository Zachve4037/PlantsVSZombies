import fri.shapesge.Obdlznik;
/**
 * Trieda vytvori segment potrebný na vytvorenie sedem segmentového policka.
 * trieda bola inspirovana stvrtym tyzdnom
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class Segment {
    private Obdlznik obdlznik;
    /**
     * Konstruktor vytvori novy obdlznik, zmeni mu rozmery a poziciu
     * @param x sluzi ako suradnica na vytvorenie segmentu na potrebnom mieste
     * @param y sluzi ako suradnica na vytvorenie segmentu na potrebnom mieste
     * @param vodorovny sluzi na zistenie rotacie segmentu
     */
    public Segment(int x, int y, boolean vodorovny) {
        this.obdlznik = new Obdlznik();
        if (vodorovny) {
            this.obdlznik.zmenStrany(17, 3);
        } else {
            this.obdlznik.zmenStrany(3, 15);
        }
        this.obdlznik.posunVodorovne(x - 60);
        this.obdlznik.posunZvisle(y - 50);
        this.obdlznik.zobraz();
    }
    
    /**
     * Metoda sluzi na zobrazenie segmentu
     */
    public void zapni() {
        this.obdlznik.zobraz();
    }
    
    /**
     * Metoda sluzi na skrytie segmentu
     */
    public void vypni() {
        this.obdlznik.skry();
    }
}
