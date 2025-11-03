import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class PracticeProblemTest {
@Test
@DisplayName("divide by zero returns 0")
void divideTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("divide", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, 15, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("parse valid integer string")
void safeConvertStringtoIntTest() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("safeConvertStringtoInt", cArg);
  // Enter code here
    assertEquals(5, (int)method.invoke(null, "5"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("invalid alphanumeric returns 0")
void safeConvertStringtoIntTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("safeConvertStringtoInt", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, "5a"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("non-digit character returns 0")
void safeConvertStringtoIntTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("safeConvertStringtoInt", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, "!"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("divide 10 by 5 equals 2")
void divideTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("divide", cArg);
  // Enter code here
    assertEquals(2, (int)method.invoke(null, 10, 5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("integer division handles remainder")
void divideTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("divide", cArg);
  // Enter code here
    assertEquals(2, (int)method.invoke(null, 12, 5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("valid index at start of array")
void validIndexTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = { int[].class, int.class};
        Method method = testClass.getDeclaredMethod("validIndex", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, new int[]{1, 3, 5, 5, 2}, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("invalid index beyond end returns false")
void validIndexTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
       Class<?>[] cArg = { int[].class, int.class};
        Method method = testClass.getDeclaredMethod("validIndex", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, new int[]{1, 3, 5}, 4));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("empty string returns 0")
void safeConvertStringtoIntTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("safeConvertStringtoInt", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, ""));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}