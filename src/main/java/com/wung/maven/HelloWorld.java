package com.wung.maven;

import org.joda.time.LocalTime;

/**
 *
 * Created by wung on 2017/1/1.
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println(currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
