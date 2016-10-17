import org.junit.Test;

/**
 * Created by hlieu on 08/29/16.
 */
public class SystemPropertiesTest {

    @Test
    public void systemPropertyWithDefault() {
        String scope = System.getProperty("properties.scope", "local");
        System.out.println(scope);
    }
    @Test
    public void systemPropertyNull() {
        String scope = System.getProperty("properties.scope");
        System.out.println(scope);
    }

    /**
     * to properly test this, add the following to VM Arguments
     *       -DmyProperties=random
     *  or   -DmyProperties="random"
     */
    @Test
    public void systemPropertyDefined() {
        String scope = System.getProperty("myProperties");
        String output = scope == null ? "Add -DmyProperties=random to VM arguments/options" : scope;
        System.out.println(output);
    }

    @Test
    public void systemPropertyDefinedWithApostrophy() {
        String scope = System.getProperty("yourProperties");
        String output = scope == null ? "Add -DyourProperties=\"random\" to VM arguments/options" : scope;
        System.out.println(output);
    }


    public static void main(String[] args) {
        SystemPropertiesTest test = new SystemPropertiesTest();
        test.systemPropertyWithDefault();
        test.systemPropertyNull();
        test.systemPropertyDefined();
        test.systemPropertyDefinedWithApostrophy();
    }
}
