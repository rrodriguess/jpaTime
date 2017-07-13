package br.com.berserker.jpaTime.repositories;

import br.com.berserker.jpaTime.entities.Times;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesRepository extends JpaRepository<Times, Integer> {
}
