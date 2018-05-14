package questions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider
{
   
 XSSFWorkbook wb;
 
 public ExcelDataProvider(String excelpath) throws IOException, IOException
 {
	 

	wb=new XSSFWorkbook(new FileInputStream(new File(excelpath)));

 }
 public int getRow(int sheetindex){
	 int row=wb.getSheetAt(sheetindex).getLastRowNum();
	 return row+1;
 }

 public int getRow(String sheetname){
	 int row=wb.getSheet(sheetname).getLastRowNum();
	 return row+1;
 }
 public String getStringData(int sheetindex, int row,int column){
	 return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();
 }
 
 
 public String getStringData(String sheetname, int row,int column){
	 return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
 }
 public int getNumericData(String sheetname , int row,int column){
	 
	 return (int) wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
 }
 public int getRowount(int sheetindex){
	 int row=wb.getSheetAt(sheetindex).getLastRowNum();
	 return row+1;
 }
 
}
