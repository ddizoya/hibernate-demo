package prueba.hibernate.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import prueba.hibernate.pojos.Customers;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customers, Long> {
	

}
