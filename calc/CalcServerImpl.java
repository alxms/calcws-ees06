package calc;

import javax.jws.WebService;

@WebService(endpointInterface = "calc.CalcServer")
public class CalcServerImpl implements CalcServer 
{
	public float soma(float fator1, float fator2) 
	{
		return fator1 + fator2;
	}
	
	public float subtrai(float fator1, float fator2) 
	{
		return fator1 - fator2;
	}
	
	public float divide(float fator1, float fator2) 
	{
		return fator1 / fator2;
	}
	
	public float multiplica(float fator1, float fator2) 
	{
		return fator1 * fator2;
	}
}
