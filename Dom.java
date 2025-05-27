import fri.shapesge.Obdlznik;
/**
 * Trieda vytvori cast hraciej plochy, na ktoru ked sa dostane zombik, tak hra skonci
 *
 * @author   Matej Zachveja
 * @version  8.1.2023
 */
public class Dom {
    private Obdlznik dom;
    /**
     * Konstruktor vytvori triedu na potrebnej pozicii s potrebnou velkostou
     */
    public Dom() {
        this.dom = new Obdlznik();
        this.dom.posunVodorovne(-60);
        this.dom.posunZvisle(-50);
        this.dom.zmenStrany(200, 600);
        this.dom.zobraz();
    }
}
