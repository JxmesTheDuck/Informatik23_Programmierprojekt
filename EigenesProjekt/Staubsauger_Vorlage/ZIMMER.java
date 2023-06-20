
/**
 * Beschreiben Sie hier die Klasse ZIMMER.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ZIMMER extends SPIEL {
    // Attribute

    // Konstruktor
    public ZIMMER()
    {
        super(800,600,true,true,false);
        hintergrundgrafikSetzen("Boden.gif");
     
    CHIP chip_1= new CHIP(zufallszahlVonBis(0,gibAnzeigeBreite()),zufallszahlVonBis(0, gibAnzeigeHoehe()),"chip.gif");
    CHIP chip_2=new CHIP(zufallszahlVonBis(0,gibAnzeigeBreite()),zufallszahlVonBis(0, gibAnzeigeHoehe()),"chip.gif");
    CHIP chip_3=new CHIP(zufallszahlVonBis(0,gibAnzeigeBreite()),zufallszahlVonBis(0, gibAnzeigeHoehe()),"chip.gif");
    
    }

    // Methoden

}
