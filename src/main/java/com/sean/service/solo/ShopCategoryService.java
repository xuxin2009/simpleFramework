package com.sean.service.solo;

import com.sean.entity.bo.ShopCategory;
import com.sean.entity.dto.Result;

import java.util.List;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.service.solo
 * @Description: TODO
 * @date Date : 2021年01月08日 15:08
 */

public interface ShopCategoryService {

    Result<Boolean> addShopCategory(ShopCategory shopCategory);
    Result<Boolean> removeShopCategory(int shopCategoryId);
    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);
    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);
    Result<List<ShopCategory>> queryShopCategoryList(ShopCategory shopCategoryCondition,int pageNumber, int pageSize);
}
