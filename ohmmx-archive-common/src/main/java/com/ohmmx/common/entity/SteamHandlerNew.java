package com.ohmmx.common.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "STEAM_HANDLER_NEW")
public class SteamHandlerNew {
	@Id
	private int appid;
	@Size(max = 16)
	private String type;
	private boolean analysed;

	public SteamHandlerNew() {
	}

	public int getAppid() {
		return appid;
	}

	public void setAppid(int appid) {
		this.appid = appid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAnalysed() {
		return analysed;
	}

	public void setAnalysed(boolean analysed) {
		this.analysed = analysed;
	}
}
