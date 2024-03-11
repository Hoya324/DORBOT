package com.discorddev.dorbot.api.user.model.dto.request;

public class UserSearchDTO {

	private SearchType searchType;
	private String startDate;
	private String endDate;

	public String getSearchType() {
		if (searchType != null) {
			return this.searchType.getDescription();
		}
		return "";
	}

	public void setSearchType(String searchType) {

		switch (searchType) {
			case "index":
				this.searchType = SearchType.INDEX;
				break;
			case "id":
				this.searchType = SearchType.ID;
				break;
			case "joinDate":
				this.searchType = SearchType.JOIN_DATE;
				break;
			case "name":
				this.searchType = SearchType.NAME;
				break;
			default:
				this.searchType = SearchType.EMAIL;
				break;
		}
	}
}
