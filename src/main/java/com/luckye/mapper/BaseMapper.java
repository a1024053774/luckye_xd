package com.luckye.mapper;

import java.util.List;
/*
*    提取mapper接口的共性
*
*   泛型：参数化类型
*  */
public interface BaseMapper<T> {

    /* 新增方法 */
    public void insert(T entity);

    /* 删除方法 */
    public void delete(int id);

    /* 修改方法 */
    public void update(T entity);

    /* 根据ID查询 */
    public T selectById(int id);

    /* 查询所有 */
    public List<T> selectAll();

}