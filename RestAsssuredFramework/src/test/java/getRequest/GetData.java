package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class GetData {
	
	
	@Test
	public void testResponsCode(){
		
		
		 
		int code=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
				.getStatusCode();
		 System.out.println("Response code is "+ code);
		 Assert.assertEquals(code, 200);
		 
	}
	
	@Test
	public void testbody(){
		
		String data=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
		System.out.println("Response code is"+data);
		long time=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		System.out.println("Response Time "+ time);
	}
	
	

}
