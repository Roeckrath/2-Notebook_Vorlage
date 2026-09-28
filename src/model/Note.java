package model;

import java.util.Date;

public abstract class Note {
    protected String title;
    protected String content;
    protected Date creationDate;

    /**
     * Erstellt ein neues Note Objekt. Titel und Inhalt werden als Parameter übergeben.
     * Das Datum ist das beim erzeugen des Objektes. Finde im Internet heraus, wie Date Objekte instanziiert werden.
     * @param title Titel des Note Objekts
     * @param content Inhalt der Notiz
     */
    public Note(String title, String content) {
        //TODO 01: Implementiere den Konstruktor
    }

    public abstract String display();



    //Getter und Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
