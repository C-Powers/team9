package com.kink.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import com.kink.Gender;
import com.kink.KinkCategory;
import com.kink.Orientation;
import com.kink.dao.mapper.KinkDataMapper;
import com.kink.entity.AcknowledgedKinkEntity;
import com.kink.entity.KinkEntity;
import com.kink.entity.KinksterEntity;
import com.kink.exception.NotFoundException;
import com.kink.view.KinkWithLevelView;

public class KinkDao {

	@Setter
	@Autowired
	private KinkDataMapper kinkDataMapper;  
	
	public void createKink(KinkCategory category, String name, String description) {
		String id = UUID.randomUUID().toString();
		kinkDataMapper.createKink(id, name, description, category.toString());
	}

	public List<KinkEntity> getPageOfKinks(int page) {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	public KinksterEntity getKinksterById(String kinksterId) {
		List<KinksterEntity> kinksterById = kinkDataMapper.getKinksterById(kinksterId);
		if(kinksterById == null) {
			throw new NotFoundException("Kinkster with id: " + kinksterId + " was not found");
		}
		if(kinksterById.isEmpty()) {
			throw new NotFoundException("Kinkster with id: " + kinksterId + " was not found");
		}
		return kinksterById.get(0);
	}

	public List<AcknowledgedKinkEntity> getAcknowledgedKinksByGroupId(
			String groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	public KinkEntity getKinkById(String kinkId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<KinkWithLevelView> getPageOfKinksByKinkster(int pageNo,
			String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createKinkster(String id, String nickname, String groupId, Gender gender,
			Orientation orientation) {
		kinkDataMapper.createKinkster(id, nickname, groupId, gender.toString(), orientation.toString());
		
	}
}
