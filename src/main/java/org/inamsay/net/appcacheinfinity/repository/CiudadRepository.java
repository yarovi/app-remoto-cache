package org.inamsay.net.appcacheinfinity.repository;

import org.inamsay.net.appcacheinfinity.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

    // This interface will automatically provide CRUD operations for Ciudad entities
    // No additional methods are needed unless custom queries are required
}
