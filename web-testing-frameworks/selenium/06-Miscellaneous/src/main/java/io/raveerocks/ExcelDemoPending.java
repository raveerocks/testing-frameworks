package io.raveerocks;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelDemoPending {

    public static void main(String[] args) throws IOException {

        FileInputStream testDataFileStream = new FileInputStream("/opt/training/technical/selenium/06-Miscellaneous/src/main/resources/Test Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(testDataFileStream);
        int numberOfSheets = workbook.getNumberOfSheets();
        System.out.println("Number of Sheets : "+ numberOfSheets);

        for (int i=0;i<numberOfSheets; i++){

            XSSFSheet currentSheet = workbook.getSheetAt(i);

            // Fetch Desired Sheet
            if(currentSheet.getSheetName().equals("test-data")){

                //Fetch First Row
                Row headerRow = currentSheet.getRow(0);


                int testCaseColumnIndex = -1;
                for (Cell currentCell : headerRow){
                  if(currentCell.getStringCellValue().equals("Test Cases")){
                      testCaseColumnIndex = currentCell.getColumnIndex();
                      break;
                  }
              }

                System.out.println(currentSheet);
                break;
            }
        }
    }
}
