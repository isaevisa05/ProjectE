package io.github.isaevisa05.projecte.xlsx;

import io.github.isaevisa05.projecte.StudyProfile;
import io.github.isaevisa05.projecte.entity.Student;
import io.github.isaevisa05.projecte.entity.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadXLSX {

    private ReadXLSX() {}

    public static List<Student> readStudents() {
        try {
            List<Student> list = new ArrayList<>();
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(ReadXLSX.class.getClassLoader().getResourceAsStream("universityInfo.xlsx"));
            XSSFSheet s = xssfWorkbook.getSheet("Студенты");
            Iterator<Row> iterator = s.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                Student student = Student.builder()
                        .universityId(row.getCell(0).getStringCellValue())
                        .fullName(row.getCell(1).getStringCellValue())
                        .currentCourseNumber((int) row.getCell(2).getNumericCellValue())
                        .avgExamScore((float) row.getCell(3).getNumericCellValue())
                        .build();
                list.add(student);
            }
            return list;
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
            return null;
        }
    }

    public static List<University> readUniversities() {
        try {
            List<University> list = new ArrayList<>();
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(ReadXLSX.class.getClassLoader().getResourceAsStream("universityInfo.xlsx"));
            XSSFSheet s = xssfWorkbook.getSheet("Университеты");
            var iterator = s.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                var row = iterator.next();
                University university = University.builder()
                        .id(row.getCell(0).getStringCellValue())
                        .fullName(row.getCell(1).getStringCellValue())
                        .shortName(row.getCell(2).getStringCellValue())
                        .yearOfFoundation((int) row.getCell(3).getNumericCellValue())
                        .studyProfile(StudyProfile.valueOf(row.getCell(4).getStringCellValue()))
                        .build();
                list.add(university);
            }
            return list;
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
            return null;
        }
    }

}
