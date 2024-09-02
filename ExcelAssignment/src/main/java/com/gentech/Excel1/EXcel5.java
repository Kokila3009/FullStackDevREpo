package com.gentech.Excel1;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXcel5 {

	public static void main(String[] args) {
		WriteContent();


	}

	private static void WriteContent() {
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("Names");
			String[] names = {
				    "John", "Emily", "Michael", "Sophia", "David",
				    "Emma", "Daniel", "Olivia", "James", "Isabella"
				};

			for(int i=0;i<names.length;i++)

			{
			row=sh.createRow(i);
			cell=row.createCell(10);
			cell.setCellValue(names[i]);

			}
			
			fout= new FileOutputStream("C:\\Users\\EliteBook\\Desktop\\csvoperation\\Names.xlsx");
			wb.write(fout);
			
			
			
		}catch(Exception e) {
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

