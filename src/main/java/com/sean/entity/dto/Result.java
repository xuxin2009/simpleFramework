package com.sean.entity.dto;

import lombok.Data;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.entity.dto
 * @Description: TODO
 * @date Date : 2021年01月08日 14:58
 */

@Data
public class Result<T> {
    private Integer code;

    private String msg;

    private T data;
}
