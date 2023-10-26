import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{
    @Test
    public void testfilter(){
        List<String> listtest = new ArrayList<String>();
        MyStringChecker sc = new MyStringChecker();
        listtest.add("aaaa");
        listtest.add("bb");
        listtest.add("bbb");
        listtest.add("aab");
        listtest.add("ccc");

        List<String> check = new ArrayList<String>();
        check.add("abb");
        check.add("ccc");

        assertEquals(check, ListExamples.filter(listtest, sc));
    }


    @Test
    public void testmerge(){
        List<String> list1 = new ArrayList<String>();
        list1.add("aaaa");
        list1.add("abb");
        list1.add("ddd");
        List<String> list2 = new ArrayList<String>();
        list2.add("bb");
        list2.add("ccc");

        List<String> check = new ArrayList<String>();
        check.add("aaaa");
        check.add("abb");
        check.add("bb");
        check.add("ccc");
        check.add("ddd");

        assertEquals(check, ListExamples.merge(list1, list2));
    }

}