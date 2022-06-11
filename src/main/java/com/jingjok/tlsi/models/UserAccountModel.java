package com.jingjok.tlsi.models;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "user_accounts")
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountModel {

	@Id
	private String account_uuid;
	private String displayname;

	@JsonIgnore
	@Basic(optional = true)
	private String passcode;

	private int user_balance;
	private int number_of_holdinglottery;
	private int number_of_prizes_won;
	private Date user_last_login;

	@Basic(optional = true)
	private String user_profile_img;

}
