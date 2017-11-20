package cn.it.springboot.domain;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class Notice implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	
	
}
