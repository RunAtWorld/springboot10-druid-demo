
package dev.lpf.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "seq_identity")
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String password;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAccount() {
        return account;
    }

    public void setAccount(float account) {
        this.account = account;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    private int age;

    private String email;

    private float account;

    private String memo;

    private String createTime;

    private String updateTime;
    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param username the user_name
     * @param userpwd the password
     */
    public User(String username, String userpwd) {
        this.userName = username;
        this.password = userpwd;
    }

    /**
     * Gets user_id.
     *
     * @return the user_id
     */
    public Integer getUser_id() {
        return id;
    }

    /**
     * Sets user_id.
     *
     * @param user_id the user_id
     */
    public void setUser_id(Integer user_id) {
        this.id = user_id;
    }

    /**
     * Gets user_name.
     *
     * @return the user_name
     */
    public String getUser_name() {
        return userName;
    }

    /**
     * Sets user_name.
     *
     * @param user_name the user_name
     */
    public void setUser_name(String user_name) {
        this.userName = user_name;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", user_name='" + userName + '\'' + ", password='" + password + '\'' + '}';
    }

}
