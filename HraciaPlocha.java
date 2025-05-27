import fri.shapesge.Obrazok;
/**
 * Trieda vytvory hernu plochu hry
 * bola inspirovana osmym cvicenim 
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class HraciaPlocha {
    private Dom dom;
    private PolickoDispleja[][] policka;
    private final int sirka = 9;
    private final int vyska = 5; 
    /**
     * Konstruktor vytvori dom, panel s rastlinkami a lopatami na vymazanie rastliniek,
     * vytvori policka, na ktore sa daju pokladat rastlinky
     */
    public HraciaPlocha() {
        this.dom = new Dom();
        Obrazok slnecnica = new Obrazok("imgs/Panel/Slnecnica.png", 553, 2);
        slnecnica.zobraz();
        Obrazok hrasok = new Obrazok("imgs/Panel/Hrasok.png", 603, 3);
        hrasok.zobraz();
        Obrazok kolacik = new Obrazok("imgs/Panel/kolacik.png", 653, 0);
        kolacik.zobraz();
        Obrazok lopata = new Obrazok("imgs/Panel/Lopata.png", 503, 3);
        lopata.zobraz();
        Obrazok zLopata = new Obrazok("imgs/Panel/ZLopata.png", 403, 3);
        zLopata.zobraz();
        Obrazok gLopata = new Obrazok("imgs/Panel/GLopata.png", 453, 3);
        gLopata.zobraz();
        this.policka = new PolickoDispleja[this.sirka][this.vyska];
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                this.policka[stlpec][riadok] = new PolickoDispleja(stlpec * 100, riadok * 100);
            }
        }
    }
}
