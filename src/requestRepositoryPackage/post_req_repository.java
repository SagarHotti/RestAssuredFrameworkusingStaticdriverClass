package requestRepositoryPackage;

import java.io.IOException;
import java.util.ArrayList;

import commonFunctionPackage.Utility_Common_Function;

public class post_req_repository {
	public static String base_URI() {
		String baseURI="https://reqres.in";
		return baseURI;
	}
	
	public static String post_resource() {
		String resource="api/users";
		
		return resource;
		
	}
	public static String post_req_tc1() throws IOException 
	{
		ArrayList<String>data=Utility_Common_Function.readdataexcel("post_Test_Data","post_tc_2");
		String req_name=data.get(1);
		String req_job=data.get(2);
		String requestBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return requestBody;
	}

	}