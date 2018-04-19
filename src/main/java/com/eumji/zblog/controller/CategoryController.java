package com.eumji.zblog.controller;

import com.eumji.zblog.service.CategoryService;
import com.eumji.zblog.vo.ArticleCustom;
import com.eumji.zblog.vo.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 展示的分类controller
 * FILE: com.eumji.zblog.controller.ArchiveController.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至江海
 * @author: EumJi
 * DATE: 2017/5/8
 * TIME: 15:15
 */
@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * 获取某个标签的分页文章
     * @param model 对象
     * @param pager 分页对象
     * @param categoryId
     * @return
     */
    @RequestMapping("/load/{categoryId}")
    public String loadArticleByCategory(Model model, Pager pager, @PathVariable Integer categoryId){
        List<ArticleCustom> articleList = categoryService.loadArticleByCategory(pager,categoryId);
        if (!articleList.isEmpty()){
            model.addAttribute("articleList",articleList);
            model.addAttribute("pager",pager);
            model.addAttribute("categoryName",articleList.get(0).getCategoryName());
        }
        return "blog/part/categorySummary";
    }



}