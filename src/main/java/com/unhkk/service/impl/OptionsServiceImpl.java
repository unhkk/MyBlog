package com.unhkk.service.impl;

import com.unhkk.entity.Options;
import com.unhkk.service.OptionsService;
import org.springframework.stereotype.Service;

@Service("optionsService")
public class OptionsServiceImpl extends BaseServiceImpl implements OptionsService {
	@Override
	public String selectValueByName(String name) {
		return optionsMapper.selectValueByName(name);
	}

	@Override
	public int updateOptions(Options options) {
		return optionsMapper.updateByPrimaryKeyWithBLOBs(options);
	}
}
