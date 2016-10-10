package com.sunny.icloth.service.impl;

import com.sunny.icloth.entity.Cloth;
import com.sunny.icloth.mapper.ClothMapper;
import com.sunny.icloth.service.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author feng yanli
 * @time 2016/10/9 17:39
 */
@Service("clothService")
public class ClothServiceImpl implements ClothService{

    @Autowired
    private ClothMapper clothMapper;

    @Override
    public void deleteById(int id) throws Exception {
        try {
            if (id > 0) {
                clothMapper.deleteById(id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Cloth> queryByColor(String color) throws Exception {
        List<Cloth> list = Collections.emptyList();
        if (color == null) {
            return list;
        }
        try {
            list = clothMapper.queryByColor(color);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return list;
    }

    @Override
    public List<Cloth> queryBySeason(String season) throws Exception {
        List<Cloth> list = Collections.emptyList();
        if (season == null) {
            return list;
        }
        try {
            list = clothMapper.queryBySeason(season);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return list;
    }

    @Override
    public List<Cloth> queryByType(int type) throws Exception {
        List<Cloth> list = Collections.emptyList();
        if (type <= 0) {
            return list;
        }
        try {
            list = clothMapper.queryByType(type);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return list;
    }

    @Override
    public Cloth newCloth(Cloth cloth) throws Exception {
        try {
            return clothMapper.newCloth(cloth);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public List<Cloth> queryById(int id) throws Exception {
        List<Cloth> list = Collections.emptyList();
        if (id <= 0) {
            return list;
        }
        try {
            list = clothMapper.queryById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return list;
    }
}
