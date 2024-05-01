package demo;

import com.hms.manage.domain.entity.SysUser;

import java.lang.reflect.Field;

public class invoke {
    public static void main(String[] args) {
        Class<?> userClass = SysUser.class;
        Field[] fields = userClass.getFields();

    }
}
