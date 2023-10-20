package demo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.hms.livefreedom.domain.entity.SysUser;

import java.util.LinkedList;
import java.util.List;

public class excelWriter {
    public static void main(String[] args) {
        List<SysUser> sysUsers = excelDemo3();
        EasyExcel.write("C:\\Users\\黄明水\\Desktop\\导入测试.xlsx")
                    .head(SysUser.class).excelType(ExcelTypeEnum.XLSX)
        .sheet("Data_copy").doWrite(sysUsers);
    }
    private static List<SysUser> excelDemo3() {
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
       return list;
    }
}
