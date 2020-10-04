package com.lambdaschool.javazoo.repositories;

import com.lambdaschool.javazoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{

}
