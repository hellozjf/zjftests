package com.hellozjf.test.poi;

import java.io.FileOutputStream;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class POITest {

    private static final Logger LOG = LoggerFactory.getLogger(POITest.class);

    public static void main(String[] args) throws Exception {
        
        LocalDate localDate = LocalDate.now();
        Instant instant = localDate.atStartOfDay().toInstant(ZoneOffset.ofHours(8));
        java.util.Date date = Date.from(instant);
        LOG.debug(instant.toString());
        LOG.debug(date.toString());
        
//        Instant instant = Instant.now();
//        LOG.debug(instant.toString());
//        Date date = Date.from(instant);
//        LOG.debug(date.toString());

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("Date");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue(date);
        
        HSSFCellStyle cellStyle = wb.createCellStyle();
        HSSFDataFormat dataFormat = wb.createDataFormat();
        cellStyle.setDataFormat(dataFormat.getFormat("MM/dd/yy"));
        cell.setCellStyle(cellStyle);
        
        FileOutputStream fout = new FileOutputStream("poi.xlsx");
        wb.write(fout);
        fout.close();
    }

}
