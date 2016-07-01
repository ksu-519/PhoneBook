import org.junit.*;
import util.PhoneUtil;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by ksu on 30.06.16.
 */
public class Test {

    @org.junit.Test
    public void testFindNumber()  {

        Map<String, List<String>> data = PhoneUtil.init();

        assertTrue(!PhoneUtil.findNumber(data, "Сидоров С.С.").isEmpty());

        assertTrue(!PhoneUtil.findNumber(data, "Петров П.П.").isEmpty());

        assertFalse(!PhoneUtil.findNumber(data, "Чернышева К.Ю.").isEmpty());
    }

}