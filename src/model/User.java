package model;

public class User {
    private String username;
    private Note[] notes;
    private int noteCount;

    /**
     * Erzeugt ein neues User Objekt. Der Nutzername wird als Parameter übergeben.
     * Es wird ein neues notes-Array erzeugt, die Anzahl der Plätze ist dir überlassen.
     * noteCount wird auf 0 gesetzt, da aktuell keine Notizen gespeichert sind.
     * @param username
     */
    public User(String username){
        //TODO 06: Implementiere den Konstruktor.
    }

    /**
     * Fügt dem Nutzer eine neue Notiz hinzu. Dies geschieht nur, falls noch genügend Platz im Array ist.
     * @param note Die übergebene Notiz.
     * @return Boolscher Wert, ob das Hinzufügen funktioniert hat oder nicht.
     */
    public boolean addNote(Note note) {
        //TODO 07: Implementiere die Methode
        return false;
    }

    /**
     * Löscht die Notiz, die an der entsprechenden Stelle im Notizen-Array gespeichert ist.
     * Damit es keine Leerstellen in dem Array gibt, werden alle dahinter stehenden Notizen jeweils einen Platz nach vorne verschoben.
     * @param index Index der zu löschenden Notiz
     * @return true, falls das Note-Objekt erfolgreich gelöscht wurde; false sonst
     */
    public boolean removeNote(int index) {
        //TODO 08: Implementiere die Methode
        return false;
    }

    //Getter und Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Note[] getNotes() {
        return notes;
    }
}
