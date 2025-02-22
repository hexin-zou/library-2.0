package springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import springboot.model.Category;
import springboot.request.BaseRequest;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> list();

    List<Category> listByCondition(BaseRequest baseRequest);

    void save(Category obj);

    Category getById(Integer id);

    void updateById(Category user);

    void deleteById(Integer id);

}
