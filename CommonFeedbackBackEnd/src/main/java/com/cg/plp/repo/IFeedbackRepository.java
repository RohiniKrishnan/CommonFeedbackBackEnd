package com.cg.plp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.plp.beans.CommonFeedback;
@Repository
public interface IFeedbackRepository extends CrudRepository<CommonFeedback, Integer>{

}
