import java.util.Scanner;

public class Studente {
    private String nome;
    private String cognome;
    private double mediaVoti;

    public Studente() {
        this.nome = "Sconosciuto";
        this.cognome = "Sconosciuto";
        this.mediaVoti = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            this.nome = "Sconosciuto";
            System.out.println("Errore: nome non valido. Impostato a \"Sconosciuto\".");
        }
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        if (cognome != null && !cognome.trim().isEmpty()) {
            this.cognome = cognome;
        } else {
            this.cognome = "Sconosciuto";
            System.out.println("Errore: cognome non valido. Impostato a \"Sconosciuto\".");
        }
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public void setMediaVoti(double mediaVoti) {
        if (mediaVoti >= 0 && mediaVoti <= 10) {
            this.mediaVoti = mediaVoti;
        } else {
            this.mediaVoti = 0.0;
            System.out.println("Errore: media voti non valida. Impostata a 0.0.");
        }
    }

    public void stampaDettagli() {
        System.out.println("Studente: " + nome + " " + cognome + ", Media Voti: " + mediaVoti);
    }

    public static void main(String[] args) {
        Studente studente = new Studente();
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome dello studente: ");
        String nomeUtente = scanner.nextLine();
        studente.setNome(nomeUtente);

        System.out.print("Inserisci il cognome dello studente: ");
        String cognomeUtente = scanner.nextLine();
        studente.setCognome(cognomeUtente);

        System.out.print("Inserisci la media dei voti dello studente (tra 0 e 10): ");
        double mediaVotiUtente = scanner.nextDouble();
        studente.setMediaVoti(mediaVotiUtente);

        studente.stampaDettagli();

        scanner.close();
    }
}
