package com.sean.service.solo;

import com.sean.entity.bo.HeadLine;
import com.sean.entity.dto.Result;

import java.util.List;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.service.solo
 * @Description: TODO
 * @date Date : 2021年01月08日 15:03
 */

public interface HeadLineService {

    Result<Boolean> addHeadLine(HeadLine headLine);
    Result<Boolean> removeHeadLine(int headLineId);
    Result<Boolean> modifyHeadLine(HeadLine headLine);
    Result<HeadLine> queryHeadLineById(int headLineId);
    Result<List<HeadLine>> queryHeadLines(HeadLine headLineCondition,int pageNumber, int pageSize);

}
