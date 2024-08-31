package com.riwi.RiwiMultimedia.controllers.impl;

import com.riwi.RiwiMultimedia.controllers.interfaces.IClassController;
import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.services.interfaces.IClassService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("classes")
@Tag(name = "Classes", description = "Este es el controlador de las clases")
public class ClassController implements IClassController {

    @Autowired
    IClassService classService;
    @Override
    @GetMapping("/pages")
    public ResponseEntity<List<Class>> readByPages(@RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "3") int size) {

            Pageable pageable = PageRequest.of(page, size);
            Page<Class> classPage = classService.readByPages(pageable);

            List<Class> classList = classPage.getContent();

            return ResponseEntity.ok(classList);
    }

    @Override
    public Class create(Class aClass) {
        return null;
    }

    @Override
    @GetMapping("/description/{s}")
    public Class readByDescription(String s) {
        return classService.readByDescription(s);
    }

    @Override
    @GetMapping("/{id}")
    public Class readById(@PathVariable Integer id) {
        return classService.readById(id);
    }

    @Override
    @GetMapping("/name/{s}")
    public Class readByName(String s) {
        return classService.readByName(s);
    }
}
