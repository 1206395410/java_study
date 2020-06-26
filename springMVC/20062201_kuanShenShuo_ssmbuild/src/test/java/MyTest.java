import com.demo.pojo.Books;
import com.demo.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public  void testNotFoundBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        List<Books> allBooks = bookServiceImpl.getAllBooks();
        for (Books allBook : allBooks) {
            System.out.println(allBook);
        }
    }
}
