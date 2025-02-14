import java.util.Scanner;

public class Snack2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Converti da:");
        while(scan.hasNextLine()){
            String valutaDa = scan.next();
            System.out.println("A:");
            String valutaA = scan.next();           
            System.out.println("Che importo vuoi convertire?");
            float importo = scan.nextFloat();
            float importoConvertito = ConvertitoreValute.converti(valutaDa, valutaA, importo);
            if(importoConvertito == 0.0F){
                System.out.println("Dati inseriti non validi");
            }else{
                System.out.println("Da "+valutaDa+" a "+valutaA+" = €"+importoConvertito);
            }
            System.out.println("Converti da:");
        }
    }
}
