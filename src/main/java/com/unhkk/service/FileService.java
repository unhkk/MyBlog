package com.unhkk.service;

import com.unhkk.entity.File;

import java.util.List;

public interface FileService {

	List<File> selectAllFile();

	List<File> selectFileListWithUid(int userId);

	int insert(File newFile);

	int deleteByPrimaryKey(int fid);

	File selectFileByFid(int fid);

	int deleteSelectFile(String[] fids);
}
