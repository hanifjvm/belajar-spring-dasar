package com.hanifiamdev.spring.core;

import com.hanifiamdev.spring.core.data.Bar;
import com.hanifiamdev.spring.core.data.Foo;
import com.hanifiamdev.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DependencyInjectionTest {

    @Test
    void testNoDI() {

        var foo = new Foo();
        Bar bar = new Bar();

        FooBar fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
