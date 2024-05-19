package demo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.hms.manage.domain.user.entity.FreedomUser;

import java.util.LinkedList;
import java.util.List;

public class excelWriter {
    public static void main(String[] args) {
        List<FreedomUser> sysUsers = excelDemo3();
        EasyExcel.write("C:\\Users\\hms\\Desktop\\导入测试.xlsx")
                    .head(FreedomUser.class).excelType(ExcelTypeEnum.XLSX)
        .sheet("Data_copy").doWrite(sysUsers);
    }
    private static List<FreedomUser> excelDemo3() {
        List<FreedomUser> list = new LinkedList<>();
        ExcelReaderSheetBuilder excelReaderSheetBuilder = EasyExcel.read("C:\\Users\\hms\\Desktop\\导入测试.xlsx")
                .head(FreedomUser.class)
                .sheet()
                .registerReadListener(new AnalysisEventListener<FreedomUser>() {
                    @Override
                    public void invoke(FreedomUser sysUser, AnalysisContext analysisContext) {
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
