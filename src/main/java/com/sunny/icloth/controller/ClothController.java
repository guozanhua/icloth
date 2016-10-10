package com.sunny.icloth.controller;

import com.sunny.icloth.entity.Cloth;
import com.sunny.icloth.service.ClothService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author feng yanli
 * @time 2016/10/9 19:46
 */
@Controller
@RequestMapping(value = "")
public class ClothController {
    @Resource
    private ClothService clothService;

    @RequestMapping(value = "to/delete", method = RequestMethod.GET)
    public String toDeleteById() {
        return "delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete(Integer id) throws Exception {
        if(id <= 0) {
            throw new Exception("要删除的图片不存在");
        }
        try {
            clothService.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return "index";
    }

    @RequestMapping(value = "new", method = RequestMethod.GET)
    public String toNewCloth() throws Exception {
        return "new";
    }

    @RequestMapping(value = "new", method = RequestMethod.POST)
    public String newCloth(Cloth cloth,
                           Model model) throws Exception {
        try {
            clothService.newCloth(cloth);
        } catch (Exception e) {
            return "new";
        }
        return "";
    }

}
