package com.example.demo.dao;

public interface ICRUD<T> {

  public void addOne(T t);

  public void addMany(T[] ts);

  public void deleteOne(T t);

  public void deleteMany(T[] ts);

  public void updateOne(T t);

  public void updateMany(T[] ts);

  public T[] findAll();

  public T[] findAll(T query);

  public T findFirst(T query);
}
