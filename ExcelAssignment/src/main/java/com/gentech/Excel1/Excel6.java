package com.gentech.Excel1;



import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel6 {

	public static void main(String[] args) {
		WriteContent();


	}

	private static void WriteContent() {
		FileOutputStream fout=null;
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("Fruits");
			String[] fruits = {
					"Apple", "Banana", "Orange", "Mango", "Grapes",
					"Pineapple", "Strawberry", "Blueberry", "Watermelon", "Peach",
					"Cherry", "Papaya", "Kiwi", "Pomegranate", "Lemon",
					"Coconut", "Pear", "Plum", "Avocado", "Dragonfruit"
			};


			for(int i=0;i<fruits.length;i++)

			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue(fruits[i]);

			}

			fout= new FileOutputStream("C:\\Users\\EliteBook\\Desktop\\csvoperation\\Fruits.xlsx");
			wb.write(fout);
			
			//Reading Fruits File
			
			sh=wb.getSheet("Fruits");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				String data="";
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);

					data=cell.getStringCellValue();
					System.out.print("   "+data);

				}
				System.out.println();
			}
			//Writing it to sheet2
			
			sh=wb.createSheet("Fruits2");
			for(int i=0;i<fruits.length;i++)

			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue(fruits[i]);

			}

			fout= new FileOutputStream("C:\\Users\\EliteBook\\Desktop\\csvoperation\\Fruits.xlsx");
			wb.write(fout);
			
		

		}
		catch(Exception e) {
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


