package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

public interface PromoService {

    PromoModel getPromoByItemId(Integer itemId);//根据商品的id查到商品的促销信息，开始时间，结束时间

}
