package com.gentech.Excel1;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2write {

	public static void main(String[] args) {
		Writecolors();


	}

	private static void Writecolors() {
		FileOutputStream fout=null;
		Workbook wb = null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;

		try {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("Colors");
			String[] colors = {
					"Red", "Blue", "Green", "Yellow", "Purple",
					"Orange", "Pink", "Brown", "Black", "White",
					"Gray", "Violet", "Cyan", "Magenta", "Turquoise",
					"Gold", "Silver", "Beige", "Coral", "Indigo"
			};
			for (int i = 0; i < colors.length; i++) {
				row = sh.createRow(i);
				cell = row.createCell(0);
				cell.setCellValue(colors[i]);
			}

			fout = new FileOutputStream("C:\\Users\\EliteBook\\Desktop\\csvoperation\\Colors.xlsx");
			wb.write(fout);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
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
