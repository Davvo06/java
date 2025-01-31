class Forma {
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public double calcolaArea() {
        return 0;
    }

    public double calcolaPerimetro() {
        return 0;
    }

    public void descrizione() {
        System.out.println("Forma: " + nome);
    }
}

class Cerchio extends Forma {
    private double raggio;

    public Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return 3.14 * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * 3.14 * raggio;
    }
}

class Rettangolo extends Forma {
    private double base, altezza;

    public Rettangolo(double base, double altezza) {
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}

class Triangolo extends Forma {
    private double base, altezza, lato1, lato2, lato3;

    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        super("Triangolo");
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}

public class TestForme {
    public static void main(String[] args) {
        Forma[] forme = {
            new Cerchio(5),
            new Rettangolo(4, 6),
            new Triangolo(3, 4, 3, 4, 5)
        };

        double areaTotale = 0;
        double perimetroTotale = 0;

        for (Forma forma : forme) {
            forma.descrizione();
            double area = forma.calcolaArea();
            double perimetro = forma.calcolaPerimetro();
            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perimetro);
            System.out.println();
            
            areaTotale += area;
            perimetroTotale += perimetro;
        }
        
        System.out.println("Area totale di tutte le forme: " + areaTotale);
        System.out.println("Perimetro totale di tutte le forme: " + perimetroTotale);
    }
}