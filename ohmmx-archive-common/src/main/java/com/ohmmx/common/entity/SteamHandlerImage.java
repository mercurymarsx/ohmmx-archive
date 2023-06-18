package com.ohmmx.common.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "STEAM_HANDLER_IMAGE")
public class SteamHandlerImage {
	@Id
	private int appid;
	private boolean scaned;
	private Date handDate;

	public SteamHandlerImage() {
	}

	public int getAppid() {
		return appid;
	}

	public void setAppid(int appid) {
		this.appid = appid;
	}

	public boolean isScaned() {
		return scaned;
	}

	public void setScaned(boolean scaned) {
		this.scaned = scaned;
	}

	public Date getHandDate() {
		return handDate;
	}

	public void setHandDate(Date handDate) {
		this.handDate = handDate;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
