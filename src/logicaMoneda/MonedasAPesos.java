package logicaMoneda;

import javax.swing.JOptionPane;

public class MonedasAPesos {
	
	public void ConvertirDolaresAPesos(double valor) {
		double dolarAPesos = valor * 272.37;
		dolarAPesos = (double) Math.round(dolarAPesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dolarAPesos+ " Pesos Argentinos");
	}
	
	public void ConvertirDolaresBlueAPesos(double valor) {
		double dolarBlueAPesos = valor * 546;
		dolarBlueAPesos = (double) Math.round(dolarBlueAPesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +dolarBlueAPesos+ " Pesos Argentinos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double euroAPesos = valor * 300.18;
		euroAPesos = (double) Math.round(euroAPesos *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +euroAPesos+ " Pesos Argentinos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double libraAPesos = valor * 349.86;
		libraAPesos = (double) Math.round(libraAPesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +libraAPesos+ " Pesos Argentinos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double yenAPesos = valor * 1.93;
		yenAPesos = (double) Math.round(yenAPesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +yenAPesos+ " Pesos Argentinos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double wonAPesos = valor * 0.21;
		wonAPesos = (double) Math.round(wonAPesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +wonAPesos+ " Pesos Argentinos");
	}
	
	public void ConvertirRealAPesos(double valor) {
		double realAPesos = valor * 57.56;
		realAPesos = (double) Math.round(realAPesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +realAPesos+ " Pesos Argentinos");
	}	
}
