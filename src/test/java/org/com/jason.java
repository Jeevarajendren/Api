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
     String s= "asdfgh";
     int length = s.length();
     System.out.println(length);
	}
}
