package com.yunhe.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description
 * @Author Administrator
 * @Date 2020/11/3 15:38
 * @Version
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student{
    private String name;
    private String sex;
    private Integer age;
}