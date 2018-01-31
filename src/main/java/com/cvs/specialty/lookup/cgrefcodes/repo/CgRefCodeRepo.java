package com.cvs.specialty.lookup.cgrefcodes.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvs.specialty.lookup.cgrefcodes.entity.CgRefCodeEO;


@Repository 
public interface CgRefCodeRepo extends JpaRepository<CgRefCodeEO,Long> {

	public List<CgRefCodeEO> findByRvDomainInAndActiveIndicator(List<String> categoryList,String activeInd);
	public List<CgRefCodeEO> findByRvDomainInAndRvLowValueInAndActiveIndicator(List<String> rvDomain, List<String> rvLowValue, String activeInd);
}
