package com.sean.service.combine.impl;

import com.sean.entity.bo.HeadLine;
import com.sean.entity.bo.ShopCategory;
import com.sean.entity.dto.MainPageInfoDTO;
import com.sean.entity.dto.Result;
import com.sean.service.combine.HeadLineShopCategoryCombineService;
import com.sean.service.solo.HeadLineService;
import com.sean.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.service.combine.impl
 * @Description: TODO
 * @date Date : 2021年01月08日 15:19
 */

public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {

        //1. 获取头条列表
        HeadLine headLine = new HeadLine();
        headLine.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLines(headLine,1,4);
        //2. 获取商铺分类列表
        ShopCategory shopCategoryCondition = new ShopCategory();

        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategoryList(shopCategoryCondition,1,100);
        //3. 组装MainPageInfoDTO
        Result<MainPageInfoDTO> mainPageInfoDTOResult = mergeHeadlineAndShopCategory(headLineResult, shopCategoryResult);
        return mainPageInfoDTOResult;
    }

    private  Result<MainPageInfoDTO>  mergeHeadlineAndShopCategory(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {

        Result<MainPageInfoDTO> mainPageInfoDTOResult = new Result<MainPageInfoDTO>();

        MainPageInfoDTO mainPageInfoDTO = new MainPageInfoDTO();
        mainPageInfoDTO.setHeadLineList(headLineResult.getData());
        mainPageInfoDTO.setShopCategoryList(shopCategoryResult.getData());

        mainPageInfoDTOResult.setCode(200);
        mainPageInfoDTOResult.setData(mainPageInfoDTO);
        return null;
    }
}
