import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;


/**
 * Created by Administrator on 2018/4/10.
 */
public class MainTest {
    private TestDao td;
    private List<String> names;
    public static void main(String[] a) throws IOException {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        MainTest mt=(MainTest)ctx.getBean("mt");
        List<String> n=mt.getTd().testDao(mt.getNames());
        for(String name:n){
            System.out.print(name+"\n");
        }
    }

    public TestDao getTd() {
        return td;
    }

    public void setTd(TestDao td) {
        this.td = td;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
