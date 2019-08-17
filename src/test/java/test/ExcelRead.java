package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception {

        File file = new File("src/SampleData.xlsx");

        System.out.println(file.exists());
        //opening reading file
        FileInputStream inputStream = new FileInputStream(file);

        //loading into the class
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //passing worksheet &name
        XSSFSheet worksheet = workbook.getSheet("Employees");
        System.out.println(worksheet.getRow(2).getCell(1));

        System.out.println(worksheet.getRow(5).getCell(0));

        //To get the physical number of row used
         //not counting the empty rows
        //start counting from the 1st usedRows and counts from 1


        int usedRows=worksheet.getPhysicalNumberOfRows();
        System.out.println("PhysicallNumberOfRows: "+usedRows);

        //prints the last row u stop writing
        //starts with 0 index

        int lastUsedRow=worksheet.getLastRowNum();
        System.out.println("LastUsedRow "+lastUsedRow);

        //TODO:Print out Nancy's JOB_ID dynamically
        for(int rowNum=0;rowNum <= usedRows;rowNum++){
            if(worksheet.getRow(rowNum).getCell(0).toString().equals("Nancy")){
                System.out.println("Nancy's Job is: "+worksheet.getRow(rowNum).getCell(2)
                );
                break;
            }


        }


        //TODO: IF LASTNAME IS MATCHING , PRINT OUT IF ALL THE INFORMATION FOR THAT PERSON:
        //TODO: FIRSTNAME,LASTNAME,JOB_ID
        //GET THE LAST NAME FROM CONFIG
        String lastName= Config.getProperty("lastname");
        for(int i=0;i <= usedRows;i++){
            if(worksheet.getRow(i).getCell(1).toString().equals(lastName)){
                System.out.println("Information for employee :"+lastName+ "FirstName=====>"
                        +worksheet.getRow(i).getCell(0)+","+worksheet.getRow(i).getCell(2));
                break;

            }
        }
        workbook.close();
        inputStream.close();
    }
}