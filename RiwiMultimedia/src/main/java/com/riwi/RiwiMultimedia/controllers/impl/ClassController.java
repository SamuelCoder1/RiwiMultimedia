package com.riwi.RiwiMultimedia.controllers.impl;

import com.riwi.RiwiMultimedia.controllers.interfaces.IClassController;
import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.services.interfaces.IClassService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/class")
@Tag(name = "Classes", description = "Controlador para manejar operaciones de clases")
public class ClassController implements IClassController {

    @Autowired
    IClassService classService;

    @Override
    @PostMapping
    public Class create(@RequestBody @Valid Class newClass) {
        Class createdClass = classService.create(newClass);
        return ResponseEntity.status(201).body(createdClass).getBody();
    }

    @Override
    @GetMapping("/{id}")
    public Class readById(@PathVariable Integer id) {
        return classService.readById(id);
    }

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
    @GetMapping("/description/{s}")
    public Class readByDescription(@PathVariable String s) {
        return classService.readByDescription(s);
    }

    @Override
    @GetMapping("/name/{s}")
    public Class readByName(@PathVariable String s) {
        return classService.readByName(s);
    }
}
