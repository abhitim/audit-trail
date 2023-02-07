package com.example.audit.article;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Data
//@EntityListeners(AuditingEntityListener.class)
public class Article extends Auditable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

   private String content;
//  @CreatedBy
//  private String createdBy;
//
//  @CreatedDate
//  private LocalDateTime createdAt;
//
//  @LastModifiedBy
//  private String modifiedBy;
//
//  @LastModifiedDate
//  private LocalDateTime modifiedAt;
  
  



public long getId() {
	return id;
}

public Article() {
	super();
}

public Article(long id, String content) {
	super();
	this.id = id;
	this.content = content;
}

public void setId(long id) {
	this.id = id;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}
//
// 
//
//
//
//   public String getCreatedBy() {
//	return createdBy;
//     }
//
//    public void setCreatedBy(String createdBy) {
//	this.createdBy = createdBy;
//    }
//
//    public LocalDateTime getCreatedAt() {
//	return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//	this.createdAt = createdAt;
//   }
//
//    public String getModifiedBy() {
//	return modifiedBy;
//    }
//
//    public void setModifiedBy(String modifiedBy) {
//	this.modifiedBy = modifiedBy;
//    }
//
//   public LocalDateTime getModifiedAt() {
//	return modifiedAt;
//   }
//
//    public void setModifiedAt(LocalDateTime modifiedAt) {
//	this.modifiedAt = modifiedAt;
//     }
  
  

  
}
