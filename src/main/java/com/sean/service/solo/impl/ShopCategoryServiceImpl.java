package com.sean.service.solo.impl;

import com.sean.entity.bo.ShopCategory;
import com.sean.entity.dto.Result;
import com.sean.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.service.solo.impl
 * @Description: TODO
 * @date Date : 2021年01月08日 15:13
 */

public class ShopCategoryServiceImpl implements ShopCategoryService {

    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> removeShopCategory(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<ShopCategory> queryShopCategoryById(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<ShopCategory>> queryShopCategoryList(ShopCategory shopCategoryCondition, int pageNumber, int pageSize) {
        return null;
    }
}
