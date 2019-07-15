package com.perfm.services.orgservices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perfm.services.model.Organization;

@Service
public interface OrganizationService {
	
	Organization save(Organization organization);
	Organization findByOrganizationId(Long id);
	List<Organization> findall();

}
