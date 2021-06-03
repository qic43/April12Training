package tests;

import static org.testng.Assert.assertEquals;

import java.io.*;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import framework.Helpers;

public class ReadCSVFile extends TestSuperClass{
  @Test
  public void ReadFile() throws IOException, CsvException {
	
	String filepath = Helpers.getFileFromResources("basses.csv");
	
	Reader reader = new FileReader(filepath);
	
	CSVReader csvReader = new CSVReader(reader);
	
	List<String[]> data = csvReader.readAll();
	
	HashMap<String, String> dataset = new HashMap<String, String>();
	
	for(int i = 1; i < data.size(); i++) {
		dataset.put(data.get(i)[1], data.get(i)[0]);
	}

	int expectedResult = 6;
	int size = dataset.size();
	
	assertEquals(expectedResult, size, "The expected hashmap size should be returned");
	csvReader.close();
  }
}
