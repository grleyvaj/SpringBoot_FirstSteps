package cu.example.repository;

import cu.example.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepo extends JpaRepository<Person, Integer> {
}
