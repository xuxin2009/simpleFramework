package com.sean.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.entity
 * @Description: TODO
 * @date Date : 2021年01月08日 14:13
 */
@Data
public class HeadLine {

    private Long lineId;

    private String lineName;

    private String lineLink;

    private String lineImg;

    private Integer priority;

    private Integer enableStatus;

    private Date createTime;

    private Date lastEditTime;

}
