#include <iostream>
#include <fstream>
#include <vector>
#include "dragon3d/rib.h"

using namespace std;

int main (int argc, char * const argv[]) {

    if (argc <= 1) {
		cout << "Usage: " << argv[0] << " [rib file]" << endl;
		exit(1);
	}
	
	char* fileName = argv[1];
	
	ifstream input(fileName);
	if(input.fail()) {
		std::cout << "Error opening " << argv[1] << endl;
		exit(1);
	}
		
	vector<RibNode> ribs;// = new vector<RibNode>();
	
	while (read_rib(input, ribs)) 
		cout << "Added '" << ribs.back().content << endl;
	
	// insert code here...
    std::cout << "Hello, World!\n";
    return 0;
}
