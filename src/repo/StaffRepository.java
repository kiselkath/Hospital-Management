package repo;

import model.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for performing CRUD operations on Staff entity.
 */
@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {
}
