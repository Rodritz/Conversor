package logicaMoneda;

import javax.swing.JOptionPane;

public class PesosAMonedas {
	public void ConvertirPesosADolares(double valor) {
		double pesosADolares = valor / 272.37;
		pesosADolares = (double) Math.round(pesosADolares *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +pesosADolares+ " Dolares");
	}
	
	public void ConvertirPesosADolaresBlue(double valor) {
		double pesosADolaresBlue = valor / 546;
		pesosADolaresBlue = (double) Math.round(pesosADolaresBlue *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +pesosADolaresBlue+ " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double pesosAEuros = valor / 300.18;
		pesosAEuros = (double) Math.round(pesosAEuros *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +pesosAEuros+ " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double pesosALibras = valor / 349.86;
		pesosALibras = (double) Math.round(pesosALibras *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +pesosALibras+ " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double pesosAYen = valor / 1.93;
		pesosAYen = (double) Math.round(pesosAYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +pesosAYen+ " Yuanes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double pesosAWon = valor / 0.21;
		pesosAWon = (double) Math.round(pesosAWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +pesosAWon+ " Wons");
	}
	
	public void ConvertirPesosAReal(double valor) {
		double pesosAReal = valor / 57.56;
		pesosAReal = (double) Math.round(pesosAReal *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +pesosAReal+ " Reales");
	}
}



