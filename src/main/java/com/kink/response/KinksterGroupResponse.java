package com.kink.response;

import java.util.UUID;

import lombok.Data;

import com.kink.view.KinksterView;

@Data
public class KinksterGroupResponse {
	private String groupId;
	private KinksterView kinkster;
}
