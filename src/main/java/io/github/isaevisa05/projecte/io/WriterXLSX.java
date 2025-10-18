package io.github.isaevisa05.projecte.io;

import io.github.isaevisa05.projecte.entity.Statistics;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriterXLSX {

    private static final Logger logger = LoggerFactory.getLogger(WriterXLSX.class);

    public static void writeStatistics(List<Statistics> statisticsList, String filePath) {
        try (XSSFWorkbook xssfWorkbook = new XSSFWorkbook()) {
            logger.info("writeStatistics start");
            XSSFSheet sheet = xssfWorkbook.createSheet("Статистика");

            XSSFFont font = xssfWorkbook.createFont();
            font.setBold(true);
            font.setItalic(true);
            font.setFontHeight((short) 4);

            CellStyle cellStyle = xssfWorkbook.createCellStyle();
            cellStyle.setFont(font);
            cellStyle.setLocked(true);

            String[] headers = {"Профиль обучения", "Средний балл", "Количество студентов", "Количество университетов", "Университеты"};

            Row startRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                Cell cell = startRow.createCell(i, CellType.STRING);
                cell.setCellValue(headers[i]);
                cell.setCellStyle(cellStyle);
            }

            int i = 1;
            for (Statistics statistics : statisticsList) {
                Row row = sheet.createRow(i);

                Cell cell0 = row.createCell(0);
                cell0.setCellValue(statistics.getStudyProfile().name());
                cell0.setCellStyle(cellStyle);

                Cell cell1 = row.createCell(1);
                cell1.setCellValue(getNormalFloat(statistics.getAvgExamScore()));
                cell1.setCellStyle(cellStyle);

                Cell cell2 = row.createCell(2);
                cell2.setCellValue(statistics.getQuantityOfStudents());
                cell2.setCellStyle(cellStyle);

                Cell cell3 = row.createCell(3);
                cell3.setCellValue(statistics.getQuantityOfUniversitiesForStudyProfile());
                cell3.setCellStyle(cellStyle);

                Cell cell4 = row.createCell(4);
                cell4.setCellValue(Arrays.toString(statistics.getUniversitiesForStudyProfile().toArray()));
                cell4.setCellStyle(cellStyle);

                i++;
            }

            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
                xssfWorkbook.write(fileOutputStream);
                logger.info("writeStatistics end");
            } catch (IOException e) {
                logger.warn(e.getMessage());
            }
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }

    private static String getNormalFloat(float f) {
        String avg = f + "";
        String[] s = avg.split(",");
        if (s.length == 2) {
            if (s[1].length() > 2) {
                s[1] = s[1].substring(0, 2);
                avg = s[0] + "," + s[1];
            }
        }
        return avg;
    }

}
