package edu.torikraju.demo.Repository;

import edu.torikraju.demo.Models.Role;
import edu.torikraju.demo.Models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
