package demo.mapper;


import demo.model.User;

/**
 * @author: kevin
 * @date: 2018/4/9
 * @description:
 */
public interface UserMapper {


    User getUserByCuserId(String cuserId);

}
