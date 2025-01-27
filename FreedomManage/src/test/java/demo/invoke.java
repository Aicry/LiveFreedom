package demo;

import com.hms.manage.domain.user.entity.User;

import java.lang.reflect.Field;

public class invoke {
    public static void main(String[] args) {
        Class<?> userClass = User.class;
        Field[] fields = userClass.getFields();

    }
}
