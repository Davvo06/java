public class Studente {
    // Attributi privati
    private String nome;
    private String cognome;
    private double mediaVoti;

    // Costruttore di default
    public Studente() {
        this.nome = "Sconosciuto";
        this.cognome = "Sconosciuto";
        this.mediaVoti = 0.0;
    }

    // Getter per nome
    public String getNome() {
        return nome;
    }

    // Setter per nome
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            this.nome = "Sconosciuto";
            System.out.println("Errore: nome non valido. Impostato a \"Sconosciuto\".");
        }
    }

    // Getter per cognome
    public String getCognome() {
        return cognome;
    }

    // Setter per cognome
    public void setCognome(String cognome) {
        if (cognome != null && !cognome.trim().isEmpty()) {
            this.cognome = cognome;
        } else {
            this.cognome = "Sconosciuto";
            System.out.println("Errore: cognome non valido. Impostato a \"Sconosciuto\".");
        }
    }

    // Getter per mediaVoti
    public double getMediaVoti() {
        return mediaVoti;
    }

    // Setter per mediaVoti
    public void setMediaVoti(double mediaVoti) {
        if (mediaVoti >= 0 && mediaVoti <= 10) {
            this.mediaVoti = mediaVoti;
        } else {
            this.mediaVoti = 0.0;
            System.out.println("Errore: media voti non valida. Impostata a 0.0.");
        }
    }

    // Metodo per stampare i dettagli dello studente
    public void stampaDettagli() {
        System.out.println("Studente: " + nome + " " + cognome + ", Media Voti: " + mediaVoti);
    }

    public static void main(String[] args) {
        // Creazione di un oggetto Studente
        Studente studente = new Studente();
        
        // Impostazione dei valori utilizzando i setter
        studente.setNome("");  // Nome non valido
        studente.setCognome("Rossi");
        studente.setMediaVoti(11.0);  // Media non valida (fuori dal range)

        // Stampa dei dettagli dello studente
        studente.stampaDettagli();
    }
}
