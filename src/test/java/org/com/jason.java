package org.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jason {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader("C:\\Users\\Dell\\eclipse-workspace\\Api\\src\\test\\resources\\sample\\sample.json");
		JSONParser jsonparse = new JSONParser();
		Object parse = jsonparse.parse(reader);
		JSONObject j= (JSONObject)parse;
		Object object = j.get("data");
		System.out.println(object);
		JSONObject jason = (JSONObject)object;
		System.out.println();
		Object object2 = jason.get("id");
		System.out.println(object2);
		System.out.println();
	Object object3 = jason.get("email");
	//String mail = (String) object3;
				System.out.println(object3);
////		System.out.println(object3);
//		System.out.println();
//		Object object4 = jason.get("first");
//		System.out.println(object4);
//		System.out.println();
//		Object object5 = jason.get("last_name");
//		System.out.println(object5);
//		System.out.println();
//		Object object6 = jason.get("avatar");
//		System.out.println(object6);
//		System.out.println();
//		Object object7 = j.get("support");
//		System.out.println(object7);
//		System.out.println();
//		JSONObject json = (JSONObject)object7;
//	    Object object8 = json.get("url");
//	    System.out.println(object8);
//	    System.out.println(  );
//	    Object object9 = json.get("text");
//	    System.out.println(object9);
	}
}
