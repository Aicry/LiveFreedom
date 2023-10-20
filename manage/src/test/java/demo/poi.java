package demo;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class poi {
    public static void main(String[] args) throws IOException {
        testWriterXls();
        testWriterXlsl();
        testWriterSXlsl();
    }

    public static void testWriterXls() throws IOException {
        long begin = System.currentTimeMillis();
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        for (int i = 0; i < 65536; i++) {
            Row row = sheet.createRow(i);
            for (int i1 = 0; i1 < 10; i1++) {
                Cell cell = row.createCell(i1);
                cell.setCellValue(i1);
            }
        }
        System.out.println("over");
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\黄明水\\Desktop\\poi导出测试xls.xls");
        workbook.write(outputStream);
        outputStream.close();
        long end = System.currentTimeMillis();
        System.out.println((double) (end - begin) / 1000);
    }
    public static void testWriterXlsl() throws IOException {
        long begin = System.currentTimeMillis();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        for (int i = 0; i < 65536; i++) {
            Row row = sheet.createRow(i);
            for (int i1 = 0; i1 < 10; i1++) {
                Cell cell = row.createCell(i1);
                cell.setCellValue(i1);
            }
        }
        System.out.println("over");
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\黄明水\\Desktop\\poi导出测试xlsl.xlsl");
        workbook.write(outputStream);
        outputStream.close();
        long end = System.currentTimeMillis();
        System.out.println((double) (end - begin) / 1000);
    }

    public static void testWriterSXlsl() throws IOException {
        long begin = System.currentTimeMillis();
        try (SXSSFWorkbook workbook = new SXSSFWorkbook()) {
            Sheet sheet = workbook.createSheet();

            for (int i = 0; i < 65536; i++) {
                Row row = sheet.createRow(i);
                for (int i1 = 0; i1 < 10; i1++) {
                    Cell cell = row.createCell(i1);
                    cell.setCellValue(i1);
                }
            }
            System.out.println("over");
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\黄明水\\Desktop\\poi导出测试sxlsl.xlsl");
            workbook.write(outputStream);
            outputStream.close();
            workbook.dispose();
        }
        long end = System.currentTimeMillis();
        System.out.println((double) (end - begin) / 1000);
    }
}
