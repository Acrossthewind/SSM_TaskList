package com.acrossthewind.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Acrossthewind
 * @version 1.0
 * @description: Plan的实体类
 * @date 2023/8/22 10:11
 */

@Data
public class Plan {
    private int planId;
    private String startDate;
    private String endDate;
    private String context;
}
