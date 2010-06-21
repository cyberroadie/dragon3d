/*
 *  rib.cpp
 *  Dragon3D
 *
 *  Created by Olivier Van Acker on 13/06/2010.
 *  Copyright 2010 Transformatorhuis. All rights reserved.
 *
 */
#include <boost/algorithm/string.hpp>
#include <vector>
#include "dragon3d/rib.h"

std::istream& read_rib(std::istream& in, std::vector<RibNode>& ribs) {
	if(in) {
		std::string line;
		getline(in, line);
		boost::trim(line);
		if (line.size() > 0) {
			RibNode rn;
			rn.content = line;
			ribs.push_back(rn);
		}
	}
	return in;
}
