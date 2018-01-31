/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: ZipcodeRepository.java
 */
package com.cvs.specialty.lookup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cvs.specialty.lookup.entity.ZipCodeEO;

/**
 * 
 * @author U006407
 *
 */
@Repository
@Transactional
public interface ZipcodeRepository extends JpaRepository<ZipCodeEO, Long> {

  public ZipCodeEO findByZipCode(Long zipCode);

}
