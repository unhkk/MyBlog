package com.unhkk.service;

import com.unhkk.entity.Log;

import java.util.List;

public interface LogService {
	int insert(Log log);

	List<Integer> selectYesterdayPvUvIndexGuestbook();

	List<Integer> selectTodayPvUvIndexGuestbook();

	List<Integer> selectLastWeekPvList();

	List<Integer> selectLastWeekUvList();
}
