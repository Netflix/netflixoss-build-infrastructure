/**
 * Copyright 2014-2019 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.netflix.plugintest;

import org.junit.*;
import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void canaryTest() {
        Example example = new Example();
        System.out.println("hello do we get output");
        assertEquals("Hi test", example.sayHi("test"));
    }

    @Test
    public void messageTest() {
    	Example example = new Example();
        System.out.println("messagetest");
    	assertEquals("Hello Sam!", example.message("Sam"));
    }

    @Test
    @Ignore("this is example of failing test, ignored because of releasing testing")
    public void canaryFail() {
        Example example = new Example();
        assertEquals("Hello Rob", example.message("Bob"));
    }
}
