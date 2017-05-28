package com.bilelovic.tree.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bilelovic.tree.back.bean.Tag;
import com.bilelovic.tree.back.repository.TagRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private TagRepository repository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of Tags
		repository.save(new Tag("root", "quran",  ""));
		repository.save(new Tag("warsh", "ورش", "root"));
		repository.save(new Tag("hafs", "حفض", "root"));

		// fetch all Tags
		System.out.println("Tags found with findAll():");
		System.out.println("-------------------------------");
		for (Tag Tag : repository.findAll()) {
			System.out.println(Tag);
		}
		System.out.println();

		// fetch an individual Tag
		System.out.println("Tag found with findByCode('warsh'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByCode("warsh"));

		System.out.println("Tags found with findByParentCode('root'):");
		System.out.println("--------------------------------");
		for (Tag Tag : repository.findByParentCode("root")) {
			System.out.println(Tag);
		}

	}

    
}
