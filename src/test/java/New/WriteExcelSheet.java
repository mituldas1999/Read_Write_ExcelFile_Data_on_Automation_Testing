package New;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelSheet {
    public void WriteData(String excelPath ,String sheetName,int rowNumber,int columnNumber,String data){
        try {

            File file = new File(excelPath);
            FileInputStream fis=new FileInputStream(file);

            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet sheet = wb.getSheet(sheetName);
            XSSFRow row = sheet.getRow(rowNumber);
            XSSFCell cell = row.getCell(columnNumber,Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);

            if (cell == null) {
                row.createCell(columnNumber);
            }
            cell.setCellValue(data);

            FileOutputStream fio = new FileOutputStream(file);

            wb.write(fio);
            wb.close();

            System.out.println("Opreration Complite");

        }catch (IOException io){
            io.printStackTrace();
        }

    }

    public static void main(String[] args) {
        WriteExcelSheet we=new WriteExcelSheet();
        we.WriteData("\"C:\\Users\\Asus\\AquaProjects\\First_p1\\src\\test\\java\\Output_Data\\Excel.xlsx\"","Saturday",5,4,"Mitul");
    }
}
