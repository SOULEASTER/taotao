package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: PageController
 * Description: TODO
 *
 * @author Rajer
 * @date 2017年9月20日 下午4:24:51
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    /**
     * Title: showpage
     * Description: TODO
     *
     * @param page page
     * @return String
     */
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page) {
        return page;
    }
}
