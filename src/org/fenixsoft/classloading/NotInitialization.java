package org.fenixsoft.classloading;

/**
 * 非主动类字段演示
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SuperClass.value);
    }
}
