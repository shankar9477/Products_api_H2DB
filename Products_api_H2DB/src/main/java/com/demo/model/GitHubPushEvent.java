package com.demo.model;

import java.util.List;

public class GitHubPushEvent
{
	private String ref;
    private Repository repository;
    private Pusher pusher;
    private List<Commit> commits;
    
    
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Repository getRepository() {
		return repository;
	}
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	public Pusher getPusher() {
		return pusher;
	}
	public void setPusher(Pusher pusher) {
		this.pusher = pusher;
	}
	public List<Commit> getCommits() {
		return commits;
	}
	public void setCommits(List<Commit> commits) {
		this.commits = commits;
	}
    
    

}
