package calc; 

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalcServer 
{
	@WebMethod float soma(float fator1, float fator2);
	@WebMethod float subtrai(float fator1, float fator2);
	@WebMethod float divide(float fator1, float fator2);
	@WebMethod float multiplica(float fator1, float fator2);

}