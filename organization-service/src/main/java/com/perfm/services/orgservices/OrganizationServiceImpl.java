package com.perfm.services.orgservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfm.services.model.Organization;
import com.perfm.services.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService{

	@Autowired
	OrganizationRepository OrganizationRepository;
	
	
	@Override
	public Organization save(Organization organization) {
		Organization org = OrganizationRepository.save(organization);
		return org;
	}

	@Override
	public Organization findByOrganizationId(Long id) {
		Organization org = OrganizationRepository.findById(id).get();
		return org;
	}

	@Override
	public List<Organization> findall() {
		List<Organization> orgList = OrganizationRepository.findAll();
		return orgList;
	}

}
