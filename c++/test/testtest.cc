/*
 *  testtest.cpp
 *  Dragon3D
 *
 *  Created by Olivier Van Acker on 13/06/2010.
 *  Copyright 2010 Transformatorhuis. All rights reserved.
 *
 */

#include <gtest/gtest.h>
#include <gtest/gtest-spi.h>
#include <vector>
#include <iostream>
#include "../src/rib.cpp"

TEST(Input, Cin) {
	std::vector<RibNode> v;
	std::stringstream fake_cin;
	fake_cin << "One";
	read_rib(fake_cin, v);
	EXPECT_EQ(1, v.size());
	
	fake_cin.clear();
	fake_cin << "Two";
	read_rib(fake_cin, v);
	EXPECT_EQ(2, v.size());
}

TEST(FactorialTest, One ) {
	EXPECT_EQ(1, 1);
}

int main(int argc, char **argv) {
  ::testing::InitGoogleTest(&argc, argv);
  return RUN_ALL_TESTS();
}

