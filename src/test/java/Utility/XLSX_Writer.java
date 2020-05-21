/*
package Utility;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;

import java.io.*;

public class XLSX_Writer {

    private Sheet workSheet;
    private Workbook workBook;
    private String path;
    private Row row;
    private int rowNum = -1;

    public void XLSX_Write(String path, String sheetName){
        this.path = path;
        try {
            // Open the Excel file
            FileOutputStream ExcelFile = new FileOutputStream(new File(path));
            // Access the required test data sheet
            workBook = new HSSFWorkbook();
            workSheet = workBook.createSheet(sheetName);
            ExcelFile.close();
            Assert.assertNotNull(String.valueOf(workSheet), "Worksheet: \"" + sheetName + "\" was not found\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void setValueToCells(String value, int rowNum, int column) {
        if(this.rowNum != rowNum) {
            this.rowNum = rowNum;
            row = workSheet.createRow(rowNum);
        }
        Cell cell = row.createCell(column);
        cell.setCellValue(value);
        write();
    }

    private void write(){

        try {
            FileOutputStream writer = new FileOutputStream(path);

            workBook.write(writer);
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
*/
