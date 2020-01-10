package dev.lpf.mapper;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import dev.lpf.entity.User;

/**
 * UserRepos
 *
 */
public interface UserRepos extends JpaRepository<User,String> {

    /**
     * 通过用户名相等查询
     *
     * @param userName 用户名
     * @return
     */
    List<User> findByUserName(String userName);

    /**
     * 通过名字like查询
     *
     * @param userName 用户名
     * @return
     */
    List<User> findByUserNameLike(String userName);

    /**
     * 根据用户名，排序查询
     *
     * @param userName 用户名
     * @param sort
     * @return
     */
    List<User> findByUserName(String userName, Sort sort);
}
