package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by 16834 on 2019/9/24.
 */
public interface LabelDao extends JpaRepository<Label, String>,JpaSpecificationExecutor<Label>{

}
