class Veicolo {
    
    private String marca;
    private String modello;


    public Veicolo(String marca, String modello){
        this.marca = marca;
        this.modello = modello;
    }

    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
    public String getmodello(){
        return modello;
    }
    public void setmodello(String modello){
        this.modello = modello;
    }

       public void stampadettagli(){
        System.out.println("Marca: " +marca + ", Modello: " +modello);
    }
}
    public class Veicoli{
    public static void main(String[]args){
        Veicolo veicolo=new Veicolo ("fiat", "panda");
        veicolo.stampadettagli();
    }

    }