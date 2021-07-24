package pl.coderslab.pageobjectpatternonlteaw01;

import org.junit.*;

public class JunitExample {
    @Test
    public void shouldTest1() {
        System.out.println("test 1");
    }

    @Test
    public void shouldTest2() {
        System.out.println("test 2");
    }

    @Ignore
    @Test
    public void shouldTest3() {
        System.out.println("test 3");
    }

    @Before
    public void beforeEach() {
        System.out.println("this will be executed before EACH test");
    }

    @After
    public void afterEach() {
        System.out.println("this will be executed AFTER EACH test");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("this will be executed ONCE, before all tests in this class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("this will be executed ONCE, AFTER all tests in this class");
    }
}
