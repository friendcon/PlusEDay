package org.eday.mapper;

import org.eday.domain.MemberPhotoVO;

public interface MemberPhotoMapper {

	public int uploadProfile(MemberPhotoVO profile);
	public MemberPhotoVO getProfile(String member_id);
}