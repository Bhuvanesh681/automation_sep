package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLS_Reader {

	String filelocation=null;
	XSSFWorkbook wb=null;
	XSSFSheet sheet=null;
	XSSFRow row=null;
	XSSFCell cell=null;
	File file=null;
	FileInputStream fis=null;
	FileOutputStream fos=null;
	
	public XLS_Reader(String filelocation) throws IOException{
		this.filelocation=filelocation;
		
		file=new File(filelocation);
		if(file.createNewFile()){
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File already exists");
			fis = new FileInputStream(filelocation);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(0);
			fis.close();
		}
		
	}
	
	public void setCellValue(File file,String sheet,String colName,int rowNum,String data) throws IOException{
		try {
			fis=new FileInputStream(file);
			wb=new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
