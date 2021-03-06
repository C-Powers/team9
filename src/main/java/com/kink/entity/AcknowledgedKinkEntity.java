package com.kink.entity;

import java.util.Date;

import com.kink.Direction;
import com.kink.InterestLevel;

import lombok.Data;

@Data
public class AcknowledgedKinkEntity {
	private String kinkId;
	private String kinksterId;
	private InterestLevel interest;
	private Direction direction;
	private Date createdAt;
}
