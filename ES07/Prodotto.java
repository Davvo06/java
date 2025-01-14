public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantità;

    public Prodotto() {
        this.nome = "Sconosciuto";
        this.prezzo = 0.0;
        this.quantità = 0;
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

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0.0;
            System.out.println("Errore: prezzo non valido. Impostato a 0.0.");
        }
    }

    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        if (quantità >= 0) {
            this.quantità = quantità;
        } else {
            this.quantità = 0;
            System.out.println("Errore: quantità non valida. Impostata a 0.");
        }
    }

    public double calcolaValoreTotale() {
        return prezzo * quantità;
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Quantità: " + quantità);
        System.out.println("Valore totale: " + calcolaValoreTotale());
    }

    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto();
        
        prodotto.setNome("Penna");
        prodotto.setPrezzo(1.5); 
        prodotto.setQuantità(10); 

        prodotto.stampaDettagli();
    }
}
