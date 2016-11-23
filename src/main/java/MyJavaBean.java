/**
 * Created by hlieu on 11/22/16.
 */
public class MyJavaBean {
    private String id;
    public MyJavaBean() {
    }

    private String getId() {
        return this.id;
    }
    private void setId(String id) {
        this.id = id;
    }

    // this is still considered in the class
    public static void main (String[] args) {
        MyJavaBean b = new MyJavaBean();
        b.setId("Hello");
        System.out.print(b.getId());
    }
}
