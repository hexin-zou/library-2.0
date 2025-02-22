package springboot.api;


import com.github.pagehelper.PageInfo;
import springboot.dto.LoginDTO;
import springboot.model.Admin;
import springboot.request.BaseRequest;
import springboot.request.LoginRequest;
import springboot.request.PasswordRequest;

import java.util.List;

public interface IAdminService {

    List<Admin> list();

    PageInfo<Admin> page(BaseRequest baseRequest);

    void save(Admin obj);

    Admin getById(Integer id);

    void update(Admin obj);

    void deleteById(Integer id);

    LoginDTO login(LoginRequest request);

    void changePass(PasswordRequest request);

}
