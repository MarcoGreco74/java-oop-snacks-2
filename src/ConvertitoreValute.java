/*
Snack 2:
	Sistema di Conversione Valute
Crea una classe ConvertitoreValute che contenga un array di tassi di cambio (es. da EUR a USD, GBP, JPY...)
dichiarato come final static per impedire modifiche.
Implementa un metodo static double converti(String da, String a, double importo), che accetta la valuta di partenza, 
quella di destinazione e l'importo da convertire, restituendo il valore convertito.
Il programma deve accettare input dall’utente (valuta di partenza, valuta di destinazione, importo) e restituire l’importo convertito
*/

public class ConvertitoreValute {
    
    final static String[] tassoScambio = {"da EUR a USD", "da EUR a GBP", "da EUR a JPY", "da EUR a ALL", "da EUR a CAD", "da EUR a USD"};

    public float importoInput;

    public ConvertitoreValute(){
        
    }

    static float converti(String da, String a, float importoInput){
        float importoOutput = 0.0F;
        boolean isTasso = false;
        for(String s : tassoScambio){
            if(("da "+da+" a "+a).equals(s)){
                isTasso = true;
            }
        }
            if(isTasso == true){
                if(da.equals("EUR") && a.equals("USD")){
                importoOutput = importoInput/0.9523F;
            }else if(da.equals("EUR") && a.equals("GBP")){
                importoOutput = importoInput/0.7523F;
            }else if(da.equals("EUR") && a.equals("JPY")) {
                importoOutput = importoInput/0.6523F;
            }else if(da.equals("EUR") && a.equals("ALL")) {
                importoOutput = importoInput/0.5523F;
            }else if(da.equals("EUR") && a.equals("CAD")) {
                importoOutput = importoInput/0.4523F;
            }
        }else{
            importoOutput = 0.0F;
        }
        return importoOutput;
    }

}
