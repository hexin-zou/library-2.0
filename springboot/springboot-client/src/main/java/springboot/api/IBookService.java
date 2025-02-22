package springboot.api;

import com.github.pagehelper.PageInfo;
import springboot.model.Book;
import springboot.request.BaseRequest;


import java.util.List;

public interface IBookService {
    
    List<Book> list();

    PageInfo<Book> page(BaseRequest baseRequest);

    void save(Book obj);

    Book getById(Integer id);

    void update(Book obj);

    void deleteById(Integer id);

}
