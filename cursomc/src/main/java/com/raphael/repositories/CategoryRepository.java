//Esse objeto será capaz de acessar dados Categorias no banco de dado.

package com.raphael.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphael.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
