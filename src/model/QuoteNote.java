package model;

public class QuoteNote extends Note {
    private String source;

    public QuoteNote(String title, String quoteText, String source) {
        //TODO 02: Implementiere den Konstruktor
        super("","");
    }

    /**
     * Erzeugt aus allen Informationen einen Ausgabestring in der Form:
     * "[Titel]: [Inhalt]. Urheber: [Urheber]. Erstellt am: [Datum]"
     * @return Ausgabestring für eine einzelne Zitatsnotiz
     */
    @Override
    public String display() {
        //TODO 03: Implementiere die Methode display() entsprechend des Kommentars oben.
        return "";
    }


    //Getter und Setter
    public String getQuoteText() {
        return content;
    }

    public void setQuoteText(String quoteText) {
        this.content = quoteText;
    }

    public String getSource() { return source; }

    public void setSource(String source) {
        this.source = source;
    }
}
