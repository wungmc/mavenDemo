package com.wung.maven;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * Created by wung on 2017/1/1.
 */
public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSayHello() {
        System.out.println("tests");
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
