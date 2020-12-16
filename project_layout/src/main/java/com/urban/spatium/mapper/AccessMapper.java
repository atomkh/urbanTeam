package com.urban.spatium.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.urban.spatium.dto.Access;

@Mapper
public interface AccessMapper {
	public List<Access> getAccessRecord();
}
