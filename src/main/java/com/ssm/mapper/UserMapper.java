package com.ssm.mapper;

import java.util.List;

import com.ssm.entity.User;

/**
 * tan
 * @author lenovo
 *
 */
public interface UserMapper {

	/**
	 * 新增
	 * @param user
	 */
    void saveUser(User user);

    /**
     * 更新
     * @param user
     * @return
     */
    boolean updateUser(User user);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 查询
     * @param id
     * @return
     */
    User findUserById(int id);

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
