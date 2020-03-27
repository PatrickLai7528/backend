package com.example.demo.dao.impl;

import com.example.demo.dao.ICRUD;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class NormalCRUD<T> implements ICRUD<T> {

  @PersistenceContext private EntityManager entityManager;

  @Override
  public void addOne(T t) {
    this.entityManager.persist(t);
  }

  @Override
  public void addMany(T[] ts) {
    for (T t : ts) {
      this.addOne(t);
    }
  }

  @Override
  public void deleteOne(T t) {
    this.entityManager.remove(this.findFirst(t));
  }

  @Override
  public void deleteMany(T[] ts) {
    for (T t : ts) {
      this.deleteOne(t);
    }
  }

  @Override
  public void updateOne(T t) {}

  @Override
  public void updateMany(T[] ts) {}

  @Override
  public T[] findAll() {
    return null;
  }

  @Override
  public T[] findAll(T query) {
    return null;
  }

  @Override
  public T findFirst(T query) {
    return null;
  }
}
