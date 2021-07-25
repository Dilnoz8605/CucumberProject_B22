package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void readFromExcel() throws IOException {
     String path="SampleData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);

        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheet("Employee");
        System.out.println(sheet.getRow(3).getCell(0));
        int usedRows=sheet.getPhysicalNumberOfRows();
        for (int rownum = 0; rownum < usedRows; rownum++) {
            if(sheet.getRow(rownum).getCell(0).toString().equals("Neena")) {
                System.out.println("Current cell = "+sheet.getRow(rownum).getCell(0));
            }
            }
        }
    }

