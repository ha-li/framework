import com.gecko.addenda.MockReturnAddenda;
import com.gecko.addenda.ReturnAddenda;
import com.gecko.common.utils.AddendaFactory;

public class Main {

    public static void mockAddenda(String[] args) {
        AddendaFactory.setInstanceClass(MockReturnAddenda.class);
        ReturnAddenda addenda = AddendaFactory.createInstance("what the fuck");
        System.out.println("mock trace number:" + addenda.getTraceNumber());
    }

    public static void defaultAddenda(String[] args) {
        ReturnAddenda addenda = AddendaFactory.createInstance("some test data");
        System.out.println("original trace number:" + addenda.getTraceNumber());
    }

    public static void main(String[] args) {
        defaultAddenda(args);
        mockAddenda(args);
    }
}
