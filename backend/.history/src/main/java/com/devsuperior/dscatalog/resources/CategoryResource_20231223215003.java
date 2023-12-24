package com.devsuperior.dscatalog.resources;

import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L,"Books"));
        list.add(new Category(2L,"Eletronics"));
        return ResponseEntity.ok().body(list);
    }
}