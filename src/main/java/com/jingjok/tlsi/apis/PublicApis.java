package com.jingjok.tlsi.apis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jingjok.tlsi.controllers.UserControllers;
import com.jingjok.tlsi.exceptions.ExceptionFoundation;
import com.jingjok.tlsi.exceptions.ExceptionResponseModel.EXCEPTION_CODES;
import com.jingjok.tlsi.models.UserAccountModel;
import com.jingjok.tlsi.utilities.UniqueStringGenerationUtil;

@RestController
@RequestMapping("/api/public/")
public class PublicApis {

	@Autowired
	private UserControllers userControllers;

	@GetMapping("getFirstUUID")
	public ResponseEntity<UserAccountModel> createFirstUserOnFirstEntry(HttpServletRequest request,
			HttpServletResponse response) {
		UserAccountModel newAccount = userControllers.createNewUserForFirstEntry();
		response.addHeader("TEST", newAccount.getAccount_uuid());
		return ResponseEntity.ok().body(newAccount);
	}
}
