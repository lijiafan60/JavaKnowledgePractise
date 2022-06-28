package com.ljf.javaknowledgepractise.parameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Documented;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String name;
    Integer age;
    String address;
}
