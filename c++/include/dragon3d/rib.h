/*
 *  rib.h
 *  Dragon3D
 *
 *  Created by Olivier Van Acker on 13/06/2010.
 *  Copyright 2010 Transformatorhuis. All rights reserved.
 *
 */
#ifndef GUARD_rib_h
#define GUARD_rib_h

#include <iostream>
#include <string>
#include <vector>

class RibNode {
public:
	std::string content;
	RibNode* left, *right;
};

std::istream& read_rib(std::istream&, std::vector<RibNode>&);

#endif

		
