package demo;

import com.hms.manage.domain.user.entity.FreedomUser;

import java.lang.reflect.Field;

public class invoke {
    public static void main(String[] args) {
        Class<?> userClass = FreedomUser.class;
        Field[] fields = userClass.getFields();

    }
}
