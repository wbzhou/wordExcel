package com.chenmt.exportzip;


import com.chenmt.exportzip.utils.DateTimeUtil;
import com.chenmt.exportzip.utils.ExcelUtil;
import com.chenmt.exportzip.utils.FileUtils;
import com.chenmt.exportzip.utils.WordUtils;
import com.chenmt.exportzip.vo.CheckInfo;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: create by junting
 * @version: v1.0
 * @description:
 * @date:2020/7/8
 */
public class TestExcel {

    public static void main (String[] tt){
//        String excelFile="/Users/weekend/zwb/git/word/excel/ss.xlsx";
        String excelFile="/Users/zhouwenbin/zwb/git/exportzip/src/main/resources/templates/s2.xlsx";
        String sheetName="Sheet1";
        String wordPath="/Users/zhouwenbin/zwb/git/exportzip/src/main/resources/templates/";

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat nomalFormat = new SimpleDateFormat("yyyy-MM-dd");

        ExcelUtil ins=new ExcelUtil();
        try {

            String outDate="20170106";
//            for(int i=0;i<7;i++){
//                Date nextDate = DateTimeUtil.addDay(dateFormat.parse(outDate), 7);
//                outDate = dateFormat.format(nextDate);
//                System.out.println(outDate);
//            }

            List<CheckInfo> list=ins.readExcel(CheckInfo.class, excelFile,sheetName);
            for(CheckInfo entry : list){

                Date nextDate = DateTimeUtil.addDay(dateFormat.parse(outDate), 7);
                outDate = dateFormat.format(nextDate);

                Map<String,Object> param=new HashMap<>();
                param.put("number",entry.getNumber());
                param.put("checkDate",entry.getCheckDate());
                param.put("conclusion",entry.getConclusion());
                param.put("outDate",outDate);
                WordUtils.saveWord(param,wordPath);

                break;

            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
