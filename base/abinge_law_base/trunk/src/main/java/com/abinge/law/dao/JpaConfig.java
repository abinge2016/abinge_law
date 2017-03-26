package com.abinge.law.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbingjie071@163.com">chenbingjie</a> at  2017/3/22 14:39.
 *
 * @Author: chenbingjie
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
@Configuration
@EnableJpaRepositories("com.abinge.*")
public class JpaConfig {
}
