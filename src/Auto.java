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
*/
public class Auto {

    final int numTelaio;

    public static int contatoreAuto = 0;

    final String modello = "Utilitaria";

    public Auto(){
        contatoreAuto++;
        numTelaio = 123456789+contatoreAuto;
    }

    static int getNumeroTotaleAuto(){
            return contatoreAuto;
    }

    public String getModello() {
        return modello;
    }

}
