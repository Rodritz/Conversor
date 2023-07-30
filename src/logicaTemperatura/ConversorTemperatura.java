package logicaTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void ConvertirCelsiusAFarenheit(double valor) {
		double celsiusAFarenheit = valor * 1.8 + 32;
		celsiusAFarenheit = (double) Math.round(celsiusAFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +celsiusAFarenheit+ " Grados Farenheit ");
		//return CelciusAFarenheit;
	}
	
	public void ConvertirCelsiusAKelvin(double valor){
		double celsiusAKelvin = valor + 273.15;
		celsiusAKelvin = (double) Math.round(celsiusAKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +celsiusAKelvin+ " Kelvin");
        
	}
	
	public void ConvertirFarenheitACelsius(double valor) {
		double farenheitACelsius = (valor - 32) / 1.8;
		farenheitACelsius = (double) Math.round(farenheitACelsius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +farenheitACelsius+ " Celsius");
	}
	
	public void ConvertirFarenheitAKelvin(double valor) {
		double farenheitAKelvin = (valor - 32) / 1.8 + 273.15;		
		farenheitAKelvin = (double) Math.round(farenheitAKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +farenheitAKelvin+ " Kelvin");
	}
	
	public void ConvertirKelvinACelsius(double valor) {
		 double kelvinACelsius = valor - 273.15;
		 kelvinACelsius = (double) Math.round(kelvinACelsius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinACelsius+ " Celsius");
         //return KelvinACelcius;
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinAFarenheit = (valor-273.15) * 1.8 + 32;
		kelvinAFarenheit = (double) Math.round(kelvinAFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinAFarenheit+ " Farenheit");
	}


}
