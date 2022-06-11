package com.jingjok.tlsi.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jingjok.tlsi.models.UserAccountModel;
import com.jingjok.tlsi.repositories.UserAccountRepository;
import com.jingjok.tlsi.utilities.UniqueStringGenerationUtil;

@Service
public class UserControllers {

	@Autowired
	private UserAccountRepository userAccountRepository;

	// createNewUserForForstEntry
	public UserAccountModel createNewUserForFirstEntry() {
		UserAccountModel newAccountFromEntry = new UserAccountModel();

		String generatedUUID = UniqueStringGenerationUtil.generateUserUUID();
		String generatedDisplayName = UniqueStringGenerationUtil.generateDisplayName();

		while (userAccountRepository.existsById(generatedUUID)) {
			generatedUUID = UniqueStringGenerationUtil.generateUserUUID();
			System.out.println(generatedUUID);
		}

		newAccountFromEntry.setAccount_uuid(generatedUUID);
		newAccountFromEntry.setDisplayname(generatedDisplayName);
		newAccountFromEntry.setPasscode(null);
		newAccountFromEntry.setUser_balance(300);
		newAccountFromEntry.setNumber_of_holdinglottery(0);
		newAccountFromEntry.setNumber_of_prizes_won(0);
		newAccountFromEntry.setUser_last_login(new Date());
		newAccountFromEntry.setUser_profile_img(".defaultProfile1.png");

		return userAccountRepository.save(newAccountFromEntry);

	}

}
