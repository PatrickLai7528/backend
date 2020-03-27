package com.example.demo.model;

public class GithubOwner {
	private String logIn;
	private String id;
	private String nadeId;
	private String avatarUrl;
	private String url;
	private String htmlUrl;
	private String followersUrl;
	private String gistsUrl;
	private String starredUrl;
	private String subscriptionsUrl;
	private String orgainzationsUrl;
	private String reposUrl;
	private String eventsUrl;
	private String receivedEventsUrl;
	private String type;
	private Boolean siteAdmin;

	public GithubOwner(String logIn, String id, String nadeId, String avatarUrl, String url, String htmlUrl,
			String followersUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String orgainzationsUrl,
			String reposUrl, String eventsUrl, String receivedEventsUrl, String type, Boolean siteAdmin) {
		super();
		this.logIn = logIn;
		this.id = id;
		this.nadeId = nadeId;
		this.avatarUrl = avatarUrl;
		this.url = url;
		this.htmlUrl = htmlUrl;
		this.followersUrl = followersUrl;
		this.gistsUrl = gistsUrl;
		this.starredUrl = starredUrl;
		this.subscriptionsUrl = subscriptionsUrl;
		this.orgainzationsUrl = orgainzationsUrl;
		this.reposUrl = reposUrl;
		this.eventsUrl = eventsUrl;
		this.receivedEventsUrl = receivedEventsUrl;
		this.type = type;
		this.siteAdmin = siteAdmin;
	}

	public String getLogIn() {
		return logIn;
	}

	public void setLogIn(String logIn) {
		this.logIn = logIn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNadeId() {
		return nadeId;
	}

	public void setNadeId(String nadeId) {
		this.nadeId = nadeId;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public String getFollowersUrl() {
		return followersUrl;
	}

	public void setFollowersUrl(String followersUrl) {
		this.followersUrl = followersUrl;
	}

	public String getGistsUrl() {
		return gistsUrl;
	}

	public void setGistsUrl(String gistsUrl) {
		this.gistsUrl = gistsUrl;
	}

	public String getStarredUrl() {
		return starredUrl;
	}

	public void setStarredUrl(String starredUrl) {
		this.starredUrl = starredUrl;
	}

	public String getSubscriptionsUrl() {
		return subscriptionsUrl;
	}

	public void setSubscriptionsUrl(String subscriptionsUrl) {
		this.subscriptionsUrl = subscriptionsUrl;
	}

	public String getOrgainzationsUrl() {
		return orgainzationsUrl;
	}

	public void setOrgainzationsUrl(String orgainzationsUrl) {
		this.orgainzationsUrl = orgainzationsUrl;
	}

	public String getReposUrl() {
		return reposUrl;
	}

	public void setReposUrl(String reposUrl) {
		this.reposUrl = reposUrl;
	}

	public String getEventsUrl() {
		return eventsUrl;
	}

	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	public String getReceivedEventsUrl() {
		return receivedEventsUrl;
	}

	public void setReceivedEventsUrl(String receivedEventsUrl) {
		this.receivedEventsUrl = receivedEventsUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getSiteAdmin() {
		return siteAdmin;
	}

	public void setSiteAdmin(Boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}

}
