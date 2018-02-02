package jUnitTest;

import com.jsystems.models.UserMock;
import com.jsystems.util.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DBTest {

    UserRepository userRepository = new UserRepository();

    @Test
    public void getUsers(){
        List<UserMock> usersMockTest = new ArrayList<>();
        usersMockTest = userRepository.getAll();
        System.out.println(usersMockTest.toString());


    }

}
