package com.admin.catalogo.infrastructure;

import com.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {

        System.out.println(new UseCase().execute());
    }
}