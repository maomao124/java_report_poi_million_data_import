package mao.entity;

import java.time.LocalDateTime;
import java.util.StringJoiner;

/**
 * Project name(项目名称)：java_report_poi_million_data_export
 * Package(包名): mao.java_report_poi_million_data_export.entity
 * Class(类名): User
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/5
 * Time(创建时间)： 13:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class User
{

    private Long id;

    private String userName;

    private String phone;

    private LocalDateTime hireDate;

    private String address;

    public User()
    {
    }

    public User(Long id, String userName, String phone, LocalDateTime hireDate, String address)
    {
        this.id = id;
        this.userName = userName;
        this.phone = phone;
        this.hireDate = hireDate;
        this.address = address;
    }

    public Long getId()
    {
        return id;
    }

    public User setId(Long id)
    {
        this.id = id;
        return this;
    }

    public String getUserName()
    {
        return userName;
    }

    public User setUserName(String userName)
    {
        this.userName = userName;
        return this;
    }

    public String getPhone()
    {
        return phone;
    }

    public User setPhone(String phone)
    {
        this.phone = phone;
        return this;
    }

    public LocalDateTime getHireDate()
    {
        return hireDate;
    }

    public User setHireDate(LocalDateTime hireDate)
    {
        this.hireDate = hireDate;
        return this;
    }

    public String getAddress()
    {
        return address;
    }

    public User setAddress(String address)
    {
        this.address = address;
        return this;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("userName='" + userName + "'")
                .add("phone='" + phone + "'")
                .add("hireDate=" + hireDate)
                .add("address='" + address + "'")
                .toString();
    }
}
