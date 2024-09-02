package com.gentech.Excel1;



import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel7{

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
			sh = wb.createSheet("Vegetables");
			String[] vegetables = {
				    "Carrot", "Broccoli", "Spinach", "Potato", "Tomato",
				    "Onion", "Garlic", "Cucumber", "Bell Pepper", "Lettuce",
				    "Cauliflower", "Brussels Sprouts", "Zucchini", "Eggplant", "Beetroot",
				    "Radish", "Pumpkin", "Green Beans", "Peas", "Kale"
				};


			for(int i=0;i<vegetables.length;i++)

			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue(vegetables[i]);

			}

			fout= new FileOutputStream("C:\\Users\\EliteBook\\Desktop\\csvoperation\\vegetables.xlsx");
			wb.write(fout);
			
			//Reading Fruits File
			
			sh=wb.getSheet("Vegetables");
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
			
			sh=wb.createSheet("Vegetables2");
			int cc=row.getPhysicalNumberOfCells();
			for(int i=0;i<cc;i++)

			{
				row=sh.createRow(i);
				cell=row.createCell(10);
				cell.setCellValue(vegetables[i]);

			}

			fout= new FileOutputStream("C:\\Users\\EliteBook\\Desktop\\csvoperation\\vegetables.xlsx");
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


