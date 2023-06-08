package datahora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	
	static final long MILIS_POR_DIA = 1000*60*60*24;

	public static void main(String[] args) {
		
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

		String formato = "dd/MM/yyyy hh:mm:ss:SSS";
		
		DateFormat df = new SimpleDateFormat(formato);
		
		Date date = new Date();
		
		long tempo = date.getTime();
		
		
//		System.out.println("Milisegundos: " + tempo);
//		System.out.println("Milisegundos de um dia: " + MILIS_POR_DIA);
//		
//		System.out.println("Data: " + date);
//		
//		Date date2 = new Date(date.getTime() + (MILIS_POR_DIA * 10));
//		System.out.println("Data2: " + date2);
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append("Milis: ");
//		sb.append(date.getTime());
//		sb.append("\nDias: ");
//		sb.append(tempo / MILIS_POR_DIA);
//		sb.append("\nMeses: ");
//		sb.append(tempo / MILIS_POR_DIA / 30);
//		sb.append("\nAnos: ");
//		sb.append(tempo / MILIS_POR_DIA / 365);
//		
//		System.out.println(sb);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Data Formatada: ");
		sb.append(df.format(date));
		
		System.out.println(sb);

		
	}
	
	

}
