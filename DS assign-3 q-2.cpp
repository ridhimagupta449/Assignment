#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main()
{
    string str = "DataStructure";
    stack<char> s;

    // Push characters to stack
    for (int i = 0; i < str.length(); i++)
    {
        s.push(str[i]);
    }

    string reversed = "";
    while (!s.empty())
    {
        reversed += s.top();
        s.pop();
    }

    cout << "Original String: " << str << endl;
    cout << "Reversed String: " << reversed << endl;

    return 0;
}

