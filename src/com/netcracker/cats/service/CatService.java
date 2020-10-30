package com.netcracker.cats.service;

import com.netcracker.cats.model.Cat;

import java.util.List;

public interface CatService {

    Cat getById(Long id);
    List<Cat> getAll();
    Cat create(Cat cat);
    Cat update(Cat cat);
    boolean deleteById(Long id);

}
