//  main.cpp
//  ReverseStringGenerator
//  Created by Quincy Copeland on 10/6/18.
//  Copyright © 2018 Quincy Copeland. All rights reserved.

#include <iostream>
#include <string>

using namespace std;

string getReverseString(string inputStr) {
    
    string revStr = "";
    for(int i = inputStr.length(); i >= 0; i--) {
        revStr += inputStr[i];
    }
    return revStr;
}

int main(int argc, const char * argv[])
{
    
    string inputStr ="";
    cout << "Please enter a word to be reversed" << endl;
    getline(cin, inputStr);
    cout << getReverseString(inputStr) << endl;
    
    return 0;
}
