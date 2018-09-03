package com.cg.plp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.plp.beans.Merchant;
@Repository
public interface IMerchantRepository extends CrudRepository<Merchant, String>{

}
