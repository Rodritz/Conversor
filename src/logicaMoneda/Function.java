package logicaMoneda;

import javax.swing.JOptionPane;
public class Function {
	PesosAMonedas monedas = new PesosAMonedas();
	MonedasAPesos pesos = new MonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos Argentinos a Dólar", "De Pesos Argentinos a Dólar Blue", "De Pesos Argentinos a Euro", "De Pesos Argentinos a Libras","De Pesos Argentinos a Yen","De Pesos Argentinos a Won Coreano", "De Pesos Argentinos a Reales", "De Dólar a Pesos Argentinos", "De Dólar Blue a Pesos Argentinos", "De Euro a Pesos Argentinos", "De Libras a Pesos Argentinos","De Yen a Pesos Argentinos","De Won Coreano a Pesos Argentinos", "De Real a Pesos Argentinos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos Argentinos a Dólar":
        	monedas.ConvertirPesosADolares(Minput);
        	break;
        	
        case "De Pesos Argentinos a Dólar Blue":
        	monedas.ConvertirPesosADolaresBlue(Minput);
        	break;	
        case "De Pesos Argentinos a Euro":
        	monedas.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos Argentinos a Libras":
        	monedas.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos Argentinos a Yen":
        	monedas.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos Argentinos a Won Coreano":
        	monedas.ConvertirPesosAWon(Minput);
        	break;  
        case "De Pesos Argentinos a Reales":
        	monedas.ConvertirPesosAReal(Minput);
        	break; 	
        case "De Dólar a Pesos Argentinos":
        	pesos.ConvertirDolaresAPesos(Minput);
        	break;
        case "De Dólar Blue a Pesos Argentinos":
        	pesos.ConvertirDolaresBlueAPesos(Minput);
        	break;	        	
        case "De Euro a Pesos Argentinos":
        	pesos.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos Argentinos":
        	pesos.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos Argentinos":
        	pesos.ConvertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos Argentinos":
            pesos.ConvertirWonAPesos(Minput);
            break;
        case "De Real a Pesos Argentinos":
            pesos.ConvertirRealAPesos(Minput);
            break;    
        }      
    }
        
}
