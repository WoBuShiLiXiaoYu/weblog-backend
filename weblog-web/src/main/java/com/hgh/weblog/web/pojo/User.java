package com.hgh.weblog.web.pojo;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class User {

    // 用户名
    @NotBlank(message = "用户名不能为空")  // 确保用户名不为空
    private String username;

    // 性别
    @NotNull(message = "性别不能为空")    // 确保性别不为空
    private Integer sex;

    // 年龄
    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "年龄必须大于等于 18")
    @Max(value = 100, message = "年龄必须小于等于 100")
    private Integer age;

    // 邮箱
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

}
