package com.lost.found.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lost.found.convertor.model.FoundDataEntityToModel;
import com.lost.found.response.model.FoundDataResponseModel;

@Service
public class FoundDataService {

	@Autowired
	private FoundDataEntityToModel foundDataEntityToModel;
	
	public List<FoundDataResponseModel> findByIdProof(String idProof) throws Exception {
		return foundDataEntityToModel.getfindbyIdProof(idProof);
		
	}
}
