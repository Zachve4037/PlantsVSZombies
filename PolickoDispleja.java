import fri.shapesge.Stvorec;
/**
 * Trieda sluzi na vytvorenie 1 policka hraciej plochy
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class PolickoDispleja {
    private Stvorec stvorec;
    private int x;
    private int y;
    private int sirkaPolicka;
    /**
     * Konstruktor vytvori jedno policko na suradniciach a zmeni jeho velkost a farbu
     * @param x suradnica pre vytvorenie policka na potrebnej pozicii 
     * @param y suradnica pre vytvorenie policka na potrebnej pozicii 
     */
    public PolickoDispleja(int x, int y) {
        this.sirkaPolicka = 100;
        this.stvorec = new Stvorec();
        this.stvorec.zmenStranu(this.sirkaPolicka - 1);
        this.stvorec.posunVodorovne(140 + x);
        this.stvorec.posunZvisle(y);
        this.stvorec.zmenFarbu("green");
        this.stvorec.zobraz();
    }
}
