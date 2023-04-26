package csvFileUpload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import csvFileUpload.model.CsvModel;

@Repository
public interface CsvRepository extends JpaRepository<CsvModel, Long>{

}
