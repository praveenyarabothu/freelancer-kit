package in.sivalabs.geeksplaza.repositories;

import in.sivalabs.geeksplaza.entities.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
