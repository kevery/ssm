package com.hb.controller.system;

import com.hb.controller.base.BaseController;
import com.hb.util.PageData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
@Controller
public class LoginController extends BaseController {

    /**访问登录页
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/login_toLogin")
    public ModelAndView toLogin()throws Exception{
        ModelAndView mv = this.getModelAndView();
        PageData pd = new PageData();
        pd = this.getPageData();
        mv.setViewName("system/index/login");
        mv.addObject("pd",pd);
        return mv;
    }


    /**登陆
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/login")
    public ModelAndView login()throws Exception{
        ModelAndView mv = this.getModelAndView();
        PageData pd = new PageData();
        pd = this.getPageData();
        mv.setViewName("system/index/head");
        mv.addObject("pd",pd);
        return mv;
    }
}
