package com.productscatagories.procat.repositories;

@Repository
public interface ProductRepo extends CrudRepository <Product, Long> {
    List<Product> findAll();
    List<Product> findByCategoriesNotContains(Category category);
}