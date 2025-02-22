package springboot.api;

import com.github.pagehelper.PageInfo;
import springboot.model.Category;
import springboot.request.BaseRequest;

import java.util.List;

public interface ICategoryService {
    
    List<Category> list();

    PageInfo<Category> page(BaseRequest baseRequest);

    void save(Category obj);

    Category getById(Integer id);

    void update(Category obj);

    void deleteById(Integer id);

}
