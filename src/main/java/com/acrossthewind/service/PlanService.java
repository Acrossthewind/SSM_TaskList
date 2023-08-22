package com.acrossthewind.service;

import com.acrossthewind.mapper.PlanMapper;
import com.acrossthewind.pojo.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Acrossthewind
 * @version 1.0
 * @description: Service层
 * @date 2023/8/22 10:47
 */
@Service("planService")
public class PlanService {
    @Autowired PlanMapper planMapper;
    //增加一个计划信息
    public int addPlan(Plan plan){
        return planMapper.addPlan(plan);
    }
    //删除指定id的计划信息
    public int deletePlanById(int id){
        return planMapper.deletePlanById(id);
    }
    //更新指定id的计划信息
    public Plan updatePlanById(Plan plan){
        return planMapper.updatePlanById(plan);
    }
    //读取指定id的计划信息
    public Plan queryPlanById(int id){
        return planMapper.queryPlanById(id);
    }
    //获取全部的计划信息
    public List<Plan> queryAllPlan(){
        return planMapper.queryAllPlan();
    }
    //获取当天日期的所有计划信息
    public List<Plan> queryDate(Plan plan){
        return planMapper.queryDate(plan);
    }
}
