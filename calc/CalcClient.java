package calc;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

class CalcClient {
	public static void main(String args[]) throws Exception {
		URL url = new URL("http://127.0.0.1:9876/calc?wsdl");
		QName qname = new QName("http://calc/", "CalcServerImplService");
		Service ws = Service.create(url, qname);
		CalcServer calc = ws.getPort(CalcServer.class);
		
		System.out.println("Exemplo de soma entre os fatores 4 e 6: " + calc.soma(4, 6));
		System.out.println("Exemplo de subtracao entre os fatores 5 e 3: " + calc.subtrai(5, 3));
		System.out.println("Exemplo de divisao entre os fatores 21 e 3: " + calc.divide(21, 3));
		System.out.println("Exemplo de multiplicacao entre os fatores 3 e 8: " + calc.multiplica(3, 8));
	}
}