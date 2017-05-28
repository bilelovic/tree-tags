package com.bilelovic.tree.back.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bilelovic.tree.back.bean.Tag;
import com.bilelovic.tree.back.repository.TagRepository;

@RestController
public class TagController {

	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private TagRepository repository;
	
	@RequestMapping("/tags")
	public List<Tag> tags(@RequestParam(value = "root", required = false, defaultValue = "") String name) {

		return repository.findAll();
	}

}
