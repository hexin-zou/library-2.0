package springboot.api;

import com.github.pagehelper.PageInfo;
import springboot.model.User;
import springboot.request.BaseRequest;

import java.util.List;

public interface IUserService {

    List<User> list();

    PageInfo<User> page(BaseRequest baseRequest);

    void save(User user);

    User getById(Integer id);

    void update(User user);

    void deleteById(Integer id);

    void handleAccount(User user);

}
