package io.github.isaevisa05.projecte.xlsx;

import io.github.isaevisa05.projecte.entity.Statistics;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WriterXLSX {

    public static void writeStatistics(List<Statistics> statisticsList, String filePath) {
        try (XSSFWorkbook xssfWorkbook = new XSSFWorkbook()) {
            XSSFSheet sheet = xssfWorkbook.createSheet("Статистика");

            String[] headers = {"Профиль обучения", "Средний балл", "Количество студентов", "Количество университетов", "Университеты"};

            Row startRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                startRow.createCell(i, CellType.STRING).setCellValue(headers[i]);
            }

            int i = 1;
            for (Statistics statistics : statisticsList) {
                Row row = sheet.createRow(i++);
                row.createCell(0).setCellValue(statistics.getStudyProfile().name());
                row.createCell(1).setCellValue(statistics.getAvgExamScore());
                row.createCell(2).setCellValue(statistics.getQuantityOfStudents());
                row.createCell(3).setCellValue(statistics.getQuantityOfUniversitiesForStudyProfile());
                row.createCell(4).setCellValue(Arrays.toString(statistics.getUniversitiesForStudyProfile().toArray()));

            }

            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
                xssfWorkbook.write(fileOutputStream);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
