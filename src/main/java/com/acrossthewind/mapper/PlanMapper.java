package com.acrossthewind.mapper;

import com.acrossthewind.pojo.Plan;

import java.util.List;

/**
 * @author Acrossthewind
 * @version 1.0
 * @description: PlanMapper
 * @date 2023/8/22 10:15
 */
public interface PlanMapper {
    //增加一个计划信息
    public int addPlan(Plan plan);
    //删除指定id的计划信息
    public int deletePlanById(int id);
    //更新指定id的计划信息
    public Plan updatePlanById(Plan plan);
    //读取指定id的计划信息
    public Plan queryPlanById(int id);
    //获取全部的计划信息
    public List<Plan> queryAllPlan();

    //获取选定日期中的所有计划
    public List<Plan> queryDate(Plan plan);
}
