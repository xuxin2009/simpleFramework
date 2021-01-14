package com.sean.service.solo.impl;

import com.sean.entity.bo.HeadLine;
import com.sean.entity.dto.Result;
import com.sean.service.solo.HeadLineService;

import java.util.List;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.service.solo.impl
 * @Description: TODO
 * @date Date : 2021年01月08日 15:12
 */

public class HeadLineServiceImpl implements HeadLineService {
    @Override
    public Result<Boolean> addHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<Boolean> removeHeadLine(int headLineId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<HeadLine> queryHeadLineById(int headLineId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryHeadLines(HeadLine headLineCondition, int pageNumber, int pageSize) {
        return null;
    }
}
