package ntt.global.crm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/6 10:03
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String account;
    private String password;
    private String real_name;
    private String salt;
    private String email;
    private String phone_number;
    private Date create_time;
    private Date last_login_time;
    private int status;
    private int role_id;



}
