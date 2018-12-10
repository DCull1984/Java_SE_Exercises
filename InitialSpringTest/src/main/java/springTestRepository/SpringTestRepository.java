package springTestRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springTest.Model.SpringTestDataModel;

@Repository
public interface SpringTestRepository extends JpaRepository<SpringTestDataModel, Long>
{

}
