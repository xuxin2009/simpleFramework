package com.sean.service.combine;

import com.sean.entity.dto.MainPageInfoDTO;
import com.sean.entity.dto.Result;

import java.util.List;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package com.sean.service.combine
 * @Description: TODO
 * @date Date : 2021年01月08日 15:16
 */

public interface HeadLineShopCategoryCombineService {

    Result<MainPageInfoDTO> getMainPageInfo();
}
