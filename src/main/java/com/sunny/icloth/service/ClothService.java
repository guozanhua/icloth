package com.sunny.icloth.service;

import com.sunny.icloth.entity.Cloth;

import java.util.List;

/**
 * ClothService
 *
 * @author feng yanli
 * @time 2016/10/9 17:39
 */
public interface ClothService {
    /**
     * 根据id删除
     *
     * @param id
     * @throws Exception
     */
    public void deleteById(int id) throws Exception;

    /**
     * 根据颜色查询
     *
     * @param color
     * @return
     * @throws Exception
     */
    public List<Cloth> queryByColor(String color) throws Exception;

    /**
     * 根据季节查询
     *
     * @param season
     * @return
     * @throws Exception
     */
    public List<Cloth> queryBySeason(String season) throws Exception;

    /**
     * 根据类型查询
     *
     * @param type
     * @return
     * @throws Exception
     */
    public List<Cloth> queryByType(int type) throws Exception;

    /**
     * 录入服装
     *
     * @param cloth
     * @throws Exception
     */
    public Cloth newCloth(Cloth cloth) throws Exception;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     * @throws Exception
     */
    public List<Cloth> queryById(int id) throws Exception;
}
