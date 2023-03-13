package ADeathMatch;



public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Baran",30,120,90,30);
        Fighter f2 = new Fighter ("Metkan",15,150,85,50 );
        Match match  = new Match (f1,f2,85,100);

        match.run();
    }

    }

