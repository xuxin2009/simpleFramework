package com.sean.entity.dto;

import com.sean.entity.bo.HeadLine;
import com.sean.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.entity.dto
 * @Description: TODO
 * @date Date : 2021年01月08日 15:17
 */
@Data
public class MainPageInfoDTO {

    private List<HeadLine> headLineList;

    private List<ShopCategory> shopCategoryList;


}
