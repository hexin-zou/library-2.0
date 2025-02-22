package springboot.mapper;


import org.apache.ibatis.annotations.Mapper;
import springboot.model.User;
import springboot.request.BaseRequest;

import java.util.List;

@Mapper
public interface UserMapper {

//    @Select("select * from user")
    List<User> list();

    List<User> listByCondition(BaseRequest baseRequest);

    void save(User user);

    User getById(Integer id);

    void updateById(User user);

    void deleteById(Integer id);

    User getByUsername(String username);

}
