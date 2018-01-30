import com.guoguo.bean.User;
import com.guoguo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lenovo on 2018/1/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void sss(){
        User user = userService.getUser(0);
        System.out.println(user.getName());
    }

}
