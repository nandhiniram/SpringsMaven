/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.springsmaven;

/**
 *
 * @author Nandhini
 */


public class ByeServiceImpl implements ByeService {

 public String sayBye(Name name) {
	return "Bye " + name.getFirstName() + " " + name.getLastName();
	}

}
