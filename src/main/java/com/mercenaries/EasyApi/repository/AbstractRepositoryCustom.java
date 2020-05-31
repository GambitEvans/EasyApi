package com.mercenaries.EasyApi.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractRepositoryCustom {
    @PersistenceContext
    protected EntityManager entityManager;
}
