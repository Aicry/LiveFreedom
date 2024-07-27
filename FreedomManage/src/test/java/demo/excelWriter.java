package demo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.hms.manage.domain.user.entity.FreedomUserT;

import java.util.LinkedList;
import java.util.List;

public class excelWriter {
    public static void main(String[] args) {
        List<FreedomUserT> sysUsers = excelDemo3();
        EasyExcel.write("C:\\Users\\hms\\Desktop\\导入测试.xlsx")
                    .head(FreedomUserT.class).excelType(ExcelTypeEnum.XLSX)
        .sheet("Data_copy").doWrite(sysUsers);
    }
    private static List<FreedomUserT> excelDemo3() {
        List<FreedomUserT> list = new LinkedList<>();
        ExcelReaderSheetBuilder excelReaderSheetBuilder = EasyExcel.read("C:\\Users\\hms\\Desktop\\导入测试.xlsx")
                .head(FreedomUserT.class)
                .sheet()
                .registerReadListener(new AnalysisEventListener<FreedomUserT>() {
                    @Override
                    public void invoke(FreedomUserT sysUser, AnalysisContext analysisContext) {
                        list.add(sysUser);
                    }

                    @Override
                    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

                    }
                });
        excelReaderSheetBuilder.doRead();
        // 一行读完操作
       return list;
    }
}
