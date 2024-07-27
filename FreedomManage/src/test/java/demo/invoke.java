package demo;

import com.hms.manage.domain.user.entity.FreedomUserT;

import java.lang.reflect.Field;

public class invoke {
    public static void main(String[] args) {
        Class<?> userClass = FreedomUserT.class;
        Field[] fields = userClass.getFields();

    }
}
