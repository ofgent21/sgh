package Dominio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datas1 {

	
	public static void main(String[] args) throws ParseException {
	
		 
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
       df.setLenient(false);
        Date d1 = df.parse ("01/06/2022");
        System.out.println (d1);
       
        Date d2 = df.parse ("05/06/2022");
        String dataformatada = df.format(d2);
        System.out.println("DATA FORMATADA : "+dataformatada);
        System.out.println (d2);
        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
        System.out.println (dt / 86400000L); 
}
}
