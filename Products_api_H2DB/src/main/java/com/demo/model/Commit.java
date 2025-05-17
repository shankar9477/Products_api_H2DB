package com.demo.model;

import java.util.List;

public class Commit
{
	private String id;
    private String message;
    private String timestamp;
    private List<String> modified;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public List<String> getModified() {
		return modified;
	}
	public void setModified(List<String> modified) {
		this.modified = modified;
	}

}
