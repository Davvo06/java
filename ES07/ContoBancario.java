public class ContoBancario {
   
    private double saldo;

    public ContoBancario(double saldoIniziale) {
        if (saldoIniziale >= 0) {
            saldo = saldoIniziale;
        } else {
            saldo = 0.0;  
            System.out.println("Errore: il saldo iniziale non può essere negativo. Impostato a 0.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Errore: non è possibile impostare un saldo negativo.");
        }
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito: " + importo);
        } else {
            System.out.println("Errore: l'importo del deposito deve essere positivo.");
        }
    }

    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo: " + importo);
        } else {
            System.out.println("Errore: saldo insufficiente per il prelievo.");
        }
    }

    public static void main(String[] args) {
        
        ContoBancario conto = new ContoBancario(0.0);
        
        System.out.println("Saldo iniziale: " + conto.getSaldo());

        conto.deposita(100.0);
        conto.preleva(50.0);
        
        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}
