/**
 * 
 */
package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dudde
 *
 */

@RestController
@RequestMapping("/api")
public class DemoContrl {
	
@GetMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)	
public ResponseEntity<?> demoPageInfo(final HttpServletRequest request)throws Exception{
	
	return new ResponseEntity<>("Welcome to Demo", HttpStatus.OK);	
	}
}
