/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.worldcupgamming.controller;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xingchi.wxc
 * @version $Id: PredictController, v 0.1 14-5-21 下午4:25 xingchi.wxc Exp $$
 */
@Controller
@RequestMapping("/predict.htm")
public class PredictController {

    @RequestMapping(method = RequestMethod.GET)
    public String predictPage(ModelMap model) {
        return "predict";
    }

}
