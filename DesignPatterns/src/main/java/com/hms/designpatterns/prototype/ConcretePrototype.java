package com.hms.designpatterns.prototype;

/**
 * @ClassName ConcretePrototype
 * @Author hms
 * @Date 2024/3/1 20:15
 * @Description TODO
 */
public class ConcretePrototype extends Prototype {

    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.getId());
    }

    public static void main(String[] args) {

        Prototype prototypeA = null;
        prototypeA = new ConcretePrototype("A1");
        Prototype copyA = prototypeA.clone();


        System.out.println("原型A的名字：" + prototypeA.getId());
        System.out.println("拷贝A的名字：" + copyA.getId());

        copyA.setId("备份A1");
        System.out.println("拷贝A的名字：" + copyA.getId());
        System.out.println("原型A的名字：" + prototypeA.getId());
    }
}
