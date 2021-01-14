package com.sean.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.entity
 * @Description: TODO
 * @date Date : 2021年01月08日 14:14
 */

@Data
public class ShopCategory {

    private   Long shopCategoryId;

    private String shopCategoryName;

    private String shopCategoryDesc;

    private String shopCategoryImg;

    private Integer priority;

    private  Date createTime;

    private Date lastEditTime;

    private ShopCategory parent;


}
