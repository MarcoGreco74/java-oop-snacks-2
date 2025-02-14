/*
Snack 1:
	Contatore di Auto
Crea una classe Auto con:
Un numero di telaio (final int numeroTelaio) univoco assegnato automaticamente alla creazione.
Una variabile static int contatoreAuto per tenere traccia del numero totale di auto create.
Un modello (final String modello) assegnato al momento della creazione e non modificabile.
Ogni volta che viene creata una nuova Auto, il contatore deve aumentare e il numero di telaio deve essere assegnato in modo incrementale.
Implementa un metodo static int getNumeroTotaleAuto() che restituisca il numero totale di auto create.
Scrivi un programma che:
Crei alcune auto e stampi il loro numero di telaio e modello.
Stampi il numero totale di auto create.
Snack 2:
	Sistema di Conversione Valute
Crea una classe ConvertitoreValute che contenga un array di tassi di cambio (es. da EUR a USD, GBP, JPY...) dichiarato come final static per impedire modifiche.
Implementa un metodo static double converti(String da, String a, double importo), che accetta la valuta di partenza, quella di destinazione e l'importo da convertire, restituendo il valore convertito.
Il programma deve accettare input dall’utente (valuta di partenza, valuta di destinazione, importo) e restituire l’importo convertito.
*/
public class Snack1 {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();
        Auto auto4 = new Auto();
        System.out.println("Modello auto: "+auto1.modello+" - Numero telaio: "+auto1.getNumeroTelaio());
        System.out.println("Modello auto: "+auto2.modello+" - Numero telaio: "+auto2.getNumeroTelaio());
        System.out.println("Modello auto: "+auto3.modello+" - Numero telaio: "+auto3.getNumeroTelaio());
        System.out.println("Modello auto: "+auto4.modello+" - Numero telaio: "+auto4.getNumeroTelaio());
        System.out.println("Totale auto create: "+Auto.getNumeroTotaleAuto());
    }
}
