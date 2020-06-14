import com.demo.dao.UserDaoMysqlImpl;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        UserService userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
