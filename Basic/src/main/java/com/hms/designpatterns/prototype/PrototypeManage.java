package com.hms.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PrototypeManage
 * @Author hms
 * @Date 2024/3/1 20:53
 * @Description TODO
 */
public class PrototypeManage {

    private static Map<String, Prototype> map = new HashMap<String, Prototype>();

    /**
     * 向原型管理器里面登记原型对象或是修改某个原型对象登记信息
     *
     * @param prototypeIndex
     *            原型索引
     * @param prototype
     *            原型实例
     */
    public synchronized static void setPrototype(String prototypeIndex,
                                                 Prototype prototype) {
        map.put(prototypeIndex, prototype);
    }
    /**
     * 从原型管理器里面删除某个登记好的原型对象
     *
     * @param prototypeIndex
     *            原型索引
     */
    public synchronized static void removePrototype(String prototypeIndex) {
        map.remove(prototypeIndex);
    }
    /**
     * 获取某个原型索引对应的原型实例
     *
     * @param prototypeIndex
     *            原型索引
     * @return 原型索引对应的原型实例
     * @throws Exception
     *             如果原型索引对应的实例不存在，则抛出异常
     */
    public synchronized static Prototype getPrototype(String prototypeIndex)
            throws Exception {
        Prototype prototype = map.get(prototypeIndex);
        if (prototype == null) {
            throw new Exception("该原型实例不存在！");
        }
        return prototype;
    }

    public static void main(String[] args) throws Exception {
        Prototype prototypeA = new ConcretePrototype("A");
        setPrototype("prototype", prototypeA);
        Prototype copyA = getPrototype("prototype").clone();

        System.out.println("原型A的名字：" + prototypeA.getId());
        System.out.println("拷贝A的名字：" + copyA.getId());
        copyA.setId("备份A1");
        System.out.println("拷贝A的名字：" + copyA.getId());
        System.out.println("原型A的名字：" + prototypeA.getId());
    }
}

