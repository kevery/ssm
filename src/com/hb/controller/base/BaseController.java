package com.hb.controller.base;


import com.hb.entity.Page;
import com.hb.util.PageData;
import com.hb.util.Tools;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * BaseController 基类
 */
public class BaseController {


    private static final long serialVersionUID = 6357869213649815390L;

    /**
     * new PageData对象
     *
     * @return
     */
    public PageData getPageData() {
        return new PageData(this.getRequest());
    }

    /**
     * 得到ModelAndView
     *
     * @return
     */
    public ModelAndView getModelAndView() {
        return new ModelAndView();
    }

    /**
     * 得到request对象
     *
     * @return
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    /**
     * 得到32位的uuid
     *
     * @return
     */
    public String get32UUID() {
        return Tools.get32UUID();
    }

    /**
     * 得到分页列表的信息
     *
     * @return
     */
    public Page getPage() {
        return new Page();
    }

}
