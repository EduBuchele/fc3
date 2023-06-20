package com.admin.catalogo.application;

import com.admin.catalogo.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}