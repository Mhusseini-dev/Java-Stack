package com.productscatagories.procat.repositories;

@Repository
public interface CategoryRepo extends CrudRepository <Category, Long> {
    List<Category> findAll();
    List<Category> findByProductsNotContains(Product product);
}