package com.urban.spatium.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.urban.spatium.dto.Access;
import com.urban.spatium.mapper.AccessMapper;

@Service
@Transactional
public class AccessService {
		@Autowired
		private AccessMapper accessMapper;

		public List<Access> getAccessRecord() {
			List<Access> accessList = accessMapper.getAccessRecord();
		/*
		 * int listSize = accessList.size(); for(int i=0; i<listSize; i++) {
		 * if(accessList.get(i).getAccessID() != null) { }else {
		 * accessList.get(i).setAccessID("비회원"); }
		 * 
		 * }
		 */
			return accessList;
		}
	
	
}
