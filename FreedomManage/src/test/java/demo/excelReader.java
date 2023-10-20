package demo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.hms.manage.domain.entity.SysUser;

import java.util.*;

public class excelReader {
    public static void main(String[] args) {

        excelDemo1();
        excelDemo2();
        excelDemo3();
    }

    private static void excelDemo3() {
        List<SysUser> list = new LinkedList<>();
        ExcelReaderSheetBuilder excelReaderSheetBuilder = EasyExcel.read("C:\\Users\\黄明水\\Desktop\\导入测试.xlsx")
                .head(SysUser.class)
                .sheet()
                .registerReadListener(new AnalysisEventListener<SysUser>() {
                    @Override
                    public void invoke(SysUser sysUser, AnalysisContext analysisContext) {
                        list.add(sysUser);
                    }

                    @Override
                    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

                    }
                });
        excelReaderSheetBuilder.doRead();
        // 一行读完操作
        for (SysUser sysUser : list) {
            System.out.println(sysUser);
        }
    }

    private static void excelDemo2() {
        List<Map<Integer, String>> list = new LinkedList<>();
        ExcelReaderSheetBuilder excelReaderSheetBuilder = EasyExcel.read("C:\\Users\\黄明水\\Desktop\\导入测试.xlsx")
                .sheet()
                .registerReadListener(new AnalysisEventListener<Map<Integer, String>>() {
                    @Override
                    public void invoke(Map<Integer, String> integerStringMap, AnalysisContext analysisContext) {
                        list.add(integerStringMap);
                    }

                    @Override
                    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

                    }
                });
        excelReaderSheetBuilder.doRead();
        list.forEach(integerStringMap -> {
            // 一行读完操作
            Set<Integer> keySet = integerStringMap.keySet();
            for (Integer key : keySet) {
                System.out.print(key + ":" + integerStringMap.get(key) + " ");
            }
            System.out.println("");
        });
    }

    private static void excelDemo1() {
        ExcelReaderBuilder readerBuilder = EasyExcel.read();
        readerBuilder.file("C:\\Users\\黄明水\\Desktop\\导入测试.xlsx");
        readerBuilder.sheet("Data");
        readerBuilder.autoCloseStream(true);
        readerBuilder.excelType(ExcelTypeEnum.XLSX);
        readerBuilder.ignoreEmptyRow(true);
        readerBuilder.registerReadListener(new AnalysisEventListener<Map<Integer, String>>() {
            @Override
            public void invoke(Map<Integer, String> integerStringMap, AnalysisContext analysisContext) {
                // 一行读完操作
                Set<Integer> keySet = integerStringMap.keySet();
                Iterator<Integer> iterator = keySet.iterator();
                while (iterator.hasNext()) {
                    Integer key = iterator.next();
                    System.out.print(key + ":" + integerStringMap.get(key) + " ");
                }
                System.out.println("");
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                // 读取完毕
            }
        });

        ExcelReader reader = readerBuilder.build();
        reader.readAll();
        reader.finish();
    }
}
