package com.example.shareThought.requestDTO;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.example.shareThought.model.Thoughts;

public class ThoughtsRequestDTO {
	private Long userId;
	private String thoughtType ;
	private String content ;
	private Long likeCount ;
	private Long commentCount ;
	private String shareType ;
	private Long imageId ;
	private Date createdDate ;
	private Date updatedDate ;
	private Boolean isLikeAllowed ;
	private Boolean isCommentAllowed ;
	private Boolean isDelete;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getThoughtType() {
		return thoughtType;
	}
	public void setThoughtType(String thoughtType) {
		this.thoughtType = thoughtType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Long likeCount) {
		this.likeCount = likeCount;
	}
	public Long getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}
	public String getShareType() {
		return shareType;
	}
	public void setShareType(String shareType) {
		this.shareType = shareType;
	}
	public Long getImageId() {
		return imageId;
	}
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Boolean getIsLikeAllowed() {
		return isLikeAllowed;
	}
	public void setIsLikeAllowed(Boolean isLikeAllowed) {
		this.isLikeAllowed = isLikeAllowed;
	}
	public Boolean getIsCommentAllowed() {
		return isCommentAllowed;
	}
	public void setIsCommentAllowed(Boolean isCommentAllowed) {
		this.isCommentAllowed = isCommentAllowed;
	}
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	
	public Thoughts convertToModel() {
		Thoughts thought= new Thoughts();
		BeanUtils.copyProperties(this, thought);
		thought.setIsDelete(false);
		return thought;
	}

}
