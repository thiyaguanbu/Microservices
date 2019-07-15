package com.perfm.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perfm.services.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long>{

}
