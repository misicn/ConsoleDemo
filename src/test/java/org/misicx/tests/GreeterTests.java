package org.misicx.tests;

import org.junit.jupiter.api.Test;
import org.misicx.Greeter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreeterTests {

    @Test
    public void greetsCorrectly() {
        assertThat(Greeter.greet(), equalTo("Hello World!"));
    }

    @Test
    public void doesNotGreetIncorrectly() {
        assertThat(Greeter.greet(), not(equalTo("wrong!")));
    }
}
