package com.gentech.Excel1;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite3 {

	public static void main(String[] args) {
		WriteContent();

	}

	private static void WriteContent() {
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh =null;
		Row row=null;
		Cell cell=null;
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Diagonlly Arranged ELements");

			String[] cities = {
				    "New York", "London", "Tokyo", "Paris", "Sydney",
				    "Dubai", "Singapore", "Berlin", "Moscow", "Rome",
				    "Toronto", "Hong Kong", "Los Angeles", "Mumbai", "Madrid",
				    "Istanbul", "Seoul", "Cape Town", "Bangkok", "Buenos Aires"
				};


			for (int i = 0; i < cities.length; i++) {

				row = sh.createRow(i);
				cell = row.createCell(i);
				cell.setCellValue(cities[i]);


			}

			fout = new FileOutputStream("C:\\Users\\EliteBook\\Desktop\\csvoperation\\Flowersdiagonal.xlsx");
			wb.write(fout);
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try
			{
				fout.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}

		}


	}

}
