package com.unhkk.service;

import com.unhkk.entity.Options;

public interface OptionsService {

	String selectValueByName(String name);

	int updateOptions(Options options);
}
