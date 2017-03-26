package com.abinge.law.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbingjie071@163.com">chenbingjie</a> at  2017/3/22 14:35.
 *
 * @Author: chenbingjie
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
public interface BaseRepository<T,ID extends Serializable> extends JpaRepository<T,ID> ,JpaSpecificationExecutor<T>{
}
