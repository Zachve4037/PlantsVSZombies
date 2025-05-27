import fri.shapesge.Obdlznik;
import fri.shapesge.Manazer;
/**
 * Trieda vytvory ramcek, ktorym si vyberame, ktoru rastlinku / lopatu chceme pouzit
 *
 * @author Matej Zachveja  
 * @version 8.1.2023
 */
public class RamcekPanelu {
    private Obdlznik obdlznikA;
    private int xA;
    private Obdlznik obdlznikB;
    private int xB;
    private Obdlznik obdlznikC;
    private int xC;
    private Obdlznik obdlznikD;
    private int xD;
    private int index;
    private Manazer manazer;
    /**
     * Konstruktor vytvori 4 obdlzniky, ktore sa zobrazia okolo prvej lopaty
     */
    public RamcekPanelu() {
        this.xA = 340;
        this.xB = 387;
        this.xC = 340;
        this.xD = 340;
        this.index = 0;
        this.obdlznikA = new Obdlznik();
        this.obdlznikA.posunVodorovne(this.xA);
        this.obdlznikA.posunZvisle(-50);
        this.obdlznikA.zmenStrany(50, 3);
        this.obdlznikA.zobraz();
        this.obdlznikB = new Obdlznik();
        this.obdlznikB.posunVodorovne(this.xB);
        this.obdlznikB.posunZvisle(-50);
        this.obdlznikB.zmenStrany(3, 50);
        this.obdlznikB.zobraz();
        this.obdlznikC = new Obdlznik();
        this.obdlznikC.posunVodorovne(this.xC);
        this.obdlznikC.zmenStrany(50, 3);
        this.obdlznikC.posunZvisle(-3);
        this.obdlznikC.zobraz();
        this.obdlznikD = new Obdlznik();
        this.obdlznikD.posunVodorovne(this.xD);
        this.obdlznikD.posunZvisle(-50);
        this.obdlznikD.zmenStrany(3, 50);
        this.obdlznikD.zobraz();
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
    }
    
    /**
     * Metoda vrati index, co je pozicia, na ktorej sa ramcek nachadza
     */
    public int getIndex() {
        return this.index;
    }
    
    /**
     * Metoda posunie ramcek o 1 poziciu do lava, pokial nie je na prvom indexe
     */
    public void posunVlavo() {
        if (this.index != 0) {
            this.obdlznikA.posunVodorovne(-50);
            this.obdlznikB.posunVodorovne(-50);
            this.obdlznikC.posunVodorovne(-50);
            this.obdlznikD.posunVodorovne(-50);
            this.index--;
        }
    }
    
    /**
     * Metoda posunie ramcek o 1 poziciu do prava, pokial nie je na poslednom indexe
     */
    public void posunVpravo() {
        if (this.index != 5) {
            this.obdlznikA.posunVodorovne(50);
            this.obdlznikB.posunVodorovne(50);
            this.obdlznikC.posunVodorovne(50);
            this.obdlznikD.posunVodorovne(50);
            this.index++;
        }
    }
}
