package logicaTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celsius a Grados Farenheit", "Grados Celsius a Kelvin", "Grados Farenheit a Grados Celsius","Grados Farenheit a Grados Kelvin","Kelvin a Grados Celsius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celsius a Grados Farenheit":
        	temperatura.ConvertirCelsiusAFarenheit(Minput);
        	break;
        case "Grados Celsius a Kelvin":
            temperatura.ConvertirCelsiusAKelvin(Minput);
            break;
        case "Grados Farenheit a Grados Celcius":
           temperatura.ConvertirFarenheitACelsius(Minput);
           break;
        case "Grados Farenheit a Grados Kelvin":
            temperatura.ConvertirFarenheitAKelvin(Minput);
            break;   
        case "Kelvin a Grados Celsius":
           temperatura.ConvertirKelvinACelsius(Minput);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(Minput);
        	break;
        }
	}
}
