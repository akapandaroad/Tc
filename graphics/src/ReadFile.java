import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.InputStream;  
  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;  
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.ss.usermodel.Cell;  
//import org.apache.poi.ss.usermodel.Row;  
//import org.apache.poi.ss.usermodel.Sheet;  
//import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
  
public class ReadFile {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO 自动生成方法存根  
        File file = new File("D:/1.xlsx");  
        if(!file.exists()){  
            System.out.println("文件不存在");  
            return;  
        }  
        ReadFile rf = new ReadFile();  
        rf.readExcel(file);  
    }  
      
    /** 
     * 读取Excel数据 
     * @param file 
     */  
    public void readExcel(File file){  
        try {  
            InputStream inputStream = new FileInputStream(file);  
            String fileName = file.getName();  
            XSSFWorkbook wb = null;  
            if(fileName.endsWith("xls")){  
               // wb = new HSSFWorkbook(inputStream);//解析xls格式  
            }else if(fileName.endsWith("xlsx")){  
                wb = new XSSFWorkbook(inputStream);//解析xlsx格式  
            	 
            }  
            XSSFSheet sheet = wb.getSheetAt(0);//第一个工作表  
              
            int firstRowIndex = sheet.getFirstRowNum();  
            int lastRowIndex = sheet.getLastRowNum();  
            for(int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex ++){  
                XSSFRow row = sheet.getRow(rIndex);  
                if(row != null){  
                    int firstCellIndex = row.getFirstCellNum();  
                    int lastCellIndex = row.getLastCellNum();  
                    for(int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex ++){  
                        XSSFCell cell = row.getCell(cIndex);  
                        String value = "";  
                        if(cell != null){  
                            value = cell.toString();  
                            System.out.print(value+"\t");  
                        }  
                    }  
                    System.out.println();  
                }  
            }  
        } catch (FileNotFoundException e) {  
            // TODO 自动生成 catch 块  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO 自动生成 catch 块  
            e.printStackTrace();  
        }  
      
}
}