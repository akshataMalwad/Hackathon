package com.hackathon.api;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.jayway.restassured.path.json.JsonPath;

public class Utility {

	/**
	 * This function accepts json file and converts into string.
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static String getJsonDetails(String path) throws IOException {
		String jsonpath = new String(Files.readAllBytes(Paths.get(path)));		
		return jsonpath;
	}
	
	/**
	 * Get the hashmap from json file.
	 * 
	 * @param path
	 * @return
	 */
	public static Map<String,String> getMapFromJsonFile(String path){
		JsonPath jsonpath = new JsonPath(new File(path));
		return jsonpath.getMap("");
	}
	
}
