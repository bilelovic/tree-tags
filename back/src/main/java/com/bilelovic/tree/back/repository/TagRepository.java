package com.bilelovic.tree.back.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bilelovic.tree.back.bean.Tag;

@Repository
public interface TagRepository extends MongoRepository<Tag, String> {

    public Tag findByCode(String code);
    public List<Tag> findByParentCode(String parentCode);


}
