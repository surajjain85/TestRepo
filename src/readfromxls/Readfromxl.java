package readfromxls;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Readfromxl {
	
	WebDriver driver;
	@Test
	public void readxl() throws Exception{
		String spath="D:\\Selenium\\eclipse\\readdata.xls";
		
		File myfile= new File(spath);
		
		FileInputStream fis= new FileInputStream(myfile);
		
		HSSFWorkbook myWB= new HSSFWorkbook(fis);
		HSSFSheet mysheet=myWB.getSheetAt(0);
		
		int XRows= mysheet.getLastRowNum()+1;
		int xcolmms=mysheet.getRow(0).getLastCellNum();
		
		System.out.println("no. of rows are :"+ XRows);
		System.out.println("no. of colms are :"+ xcolmms);
		
		String [][] xdata= new String[XRows][xcolmms];
		
		
		
		for(int i=0; i<XRows; i++){
            HSSFRow row = mysheet.getRow(i);
            
            for(int j=0; j<xcolmms; j++){
                HSSFCell cell = row.getCell(j);
                String value = cellToString(cell); 
                xdata[i][j] = value;   //Store that value in to array
                
                System.out.print(value); //Print data in console
                System.out.print("@");
	}
            
            System.out.println("#");
            
            
            }
		}
	
	//Section 4: This method will convert object of type cell into String
	public String cellToString(HSSFCell cell){//Declare a method "cellToString()" which will convert an object of type cell into string
	        int type = cell.getCellType();// This method "getCellType()" will return an integer which is 0-5 and on the basis of this integer value we will use SWITCH
	       
	        Object result; // Its an temporary object which will hold value in switch statement
	       
	        switch(type){
	       
	        case HSSFCell.CELL_TYPE_NUMERIC: // If a cell contain numeric value then it will return 0
	            result = cell.getNumericCellValue();
	            System.out.println("Value of type is : " +type);
	            break;
	           
	        case HSSFCell.CELL_TYPE_STRING: // If a cell string value then it will return 1
	            result = cell.getStringCellValue();
	            break;
	           
	        case HSSFCell.CELL_TYPE_FORMULA:  // If a cell contain formula then it will return 2
	            System.out.println("Can not eveulate formila in JAVA");
	            throw new RuntimeException("Can not eveulate formila in JAVA");
	           
	        case HSSFCell.CELL_TYPE_BLANK: // If a cell contain blank value then it will return 3
	            result = "";
	            break;
	           
	        case HSSFCell.CELL_TYPE_BOOLEAN: // If a cell contain boolean value then it will return 4
	            result = cell.getBooleanCellValue();
	            break;
	           
	        case HSSFCell.CELL_TYPE_ERROR:// If a cell contain error then it will return 5
	            System.out.println("Can not eveulate formila in JAVA");
	            throw new RuntimeException("This cell has an error");
	           
	        default:
	            throw new RuntimeException("We dont support this cell type : " +type);
	        }
	        return result.toString();   //Here "toString()" method will convert result object to string; Here question may arise i.e why convert value into string...? This is so because we already have an array[xData] in which we will put this value and that is declared as STRING.
	       
	    }
	}



