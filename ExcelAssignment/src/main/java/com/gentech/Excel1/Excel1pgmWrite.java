package com.gentech.Excel1;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1pgmWrite {

    public static void main(String[] args) {
        WriteContent();
    }

    private static void WriteContent() {
        FileOutputStream fout = null;
        Workbook wb = null;
        org.apache.poi.ss.usermodel.Sheet sh = null;
        Row row = null;
        Cell cell = null;

        try {
            wb = new XSSFWorkbook();
            sh = wb.createSheet("Flowers");

            String[] flowers = {
                "Rose", "Tulip", "Sunflower", "Daisy", "Lily",
                "Orchid", "Lavender", "Marigold", "Daffodil", "Iris",
                "Chrysanthemum", "Carnation", "Lotus", "Peony", "Jasmine",
                "Dahlia", "Hibiscus", "Gardenia", "Violet", "Begonia"
            };

            for (int i = 0; i < flowers.length; i++) {
                row = sh.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(flowers[i]);
            }

            fout = new FileOutputStream("C:\\Users\\EliteBook\\Desktop\\csvoperation\\Flowers.xlsx");
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
