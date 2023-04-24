package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserV1;
import com.model.UserV2;

@RestController
public class VersioningController {
	
//----------------------URL-based versioning--------------------
	@GetMapping("/v1/user")
	public UserV1 getFirstVersionOfUser() {
		return new UserV1("chetan phogat");
	}

	@GetMapping("/v2/user")
	public UserV2 getSecondVersionOfUser() {
		return new UserV2("chetan", "phogat");
	}
//---------------------------------------------------------------

//----------------------Query parameter versioning--------------------

	@GetMapping(path = "/user", params = "version=1")
	public UserV1 getFirstVersionOfParmsUser() {
		return new UserV1("chetan phogat");
	}

	@GetMapping(path = "/user", params = "version=2")
	public UserV2 getSecondVersionOfParmsUser() {
		return new UserV2("chetan", "phogat");
	}
//-----------------------------------------------------------------	

//----------------------Header-based versioning--------------------

	@GetMapping(path = "/user/header", headers = "X-API-VERSION=1")
	public UserV1 getFirstVersionOfHeaderUser() {
		return new UserV1("chetan phogat");
	}

	@GetMapping(path = "/user/header", headers = "X-API-VERSION=2")
	public UserV2 getSecondVersionOfHeaderUser() {
		return new UserV2("chetan", "phogat");
	}
//-----------------------------------------------------------------	
	
// ----------------------Content negotiation versioning------------

	@GetMapping(path = "/user/accept", produces = "application/vnd.company.app-v1+json")
	public UserV1 getFirstVersionOfContentUser() {
		return new UserV1("chetan phogat");
	}

	@GetMapping(path = "/user/accept", produces = "application/vnd.company.app-v+json")
	public UserV2 getSecondVersionOfContentUser() {
		return new UserV2("chetan", "phogat");
	}
// -----------------------------------------------------------------
}
// There are several approaches to versioning an API, including:

// 1. URL-based versioning: 
//		- This approach adds a version number to the API's URL, 
//		  for example: https://api.example.com/v1/users. 
//		  Each new version of the API would have a different URL.

// 2. Query parameter versioning: 
//		- This approach adds a version number as a query parameter, 
//		  for example: https://api.example.com/users?version=1.

// 3. Header-based versioning: 
//      - This approach adds a version number as a custom header,
//		  for example: X-API-Version: 1.
//
// 4. Content negotiation versioning: 
//		- This approach uses the Accept header to indicate the desired API version, 
//		  for example: Accept: application/vnd.example.v1+json.