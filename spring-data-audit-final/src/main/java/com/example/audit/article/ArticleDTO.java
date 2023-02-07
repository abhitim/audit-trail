package com.example.audit.article;

import lombok.Data;

@Data
public class ArticleDTO {

  private String content;

public ArticleDTO(String content) {
	super();
	this.content = content;
}


public ArticleDTO() {
	super();
}


public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}
  
  
}
