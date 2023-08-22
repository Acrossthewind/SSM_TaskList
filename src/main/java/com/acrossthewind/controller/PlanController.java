package com.acrossthewind.controller;

import com.acrossthewind.pojo.Plan;
import com.acrossthewind.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Acrossthewind
 * @version 1.0
 * @description: TODO
 * @date 2023/8/22 11:04
 */
@Controller
@RequestMapping("/planSystem")
public class PlanController {
    @Autowired
    PlanService planService;

    @RequestMapping("/allPlan")
    public String planList(Model model){
        List<Plan> plans = planService.queryAllPlan();
        model.addAttribute("plans",plans);
        return "planList";
    }

    @RequestMapping("/toAddPlan")
    public String toAddPlan(){
        return "addPlan";
    }

    @RequestMapping("/addPlan")
    public String addPlan(Plan plan){
        planService.addPlan(plan);
        return "redirect:/planSystem/allPlan";
    }

    @RequestMapping("/deletePlan")
    public String deletePlan(int planId){
        planService.deletePlanById(planId);
        return "redirect:/planSystem/allPlan";
    }

    @RequestMapping("/queryDate")
    public String queryStartDate(Plan plan,Model model){
        List<Plan> plans = planService.queryDate(plan);
        model.addAttribute("plans",plans);
        return "planList";
    }

    @RequestMapping("/toUpdatePlan")
    public String toUpdatePlan(Plan plan,Model model){
        Plan qPlan = planService.queryPlanById(plan.getPlanId());
        model.addAttribute("QPlan",qPlan);
        return "updatePlan";
    }

    @RequestMapping("/updatePlan")
    public String updatePlan(Plan plan, Model model){
        planService.updatePlanById(plan);
        return "redirect:/planSystem/allPlan";
    }


}
