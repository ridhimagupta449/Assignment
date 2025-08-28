#include <iostream>
#include <stack>
using namespace std;

bool isBalanced(string expr)
{
    stack<char> s;

    for (int i = 0; i < expr.length(); i++)
    {
        char ch = expr[i];

        // If opening bracket ? push into stack
        if (ch == '(' || ch == '{' || ch == '[')
        {
            s.push(ch);
        }
        // If closing bracket ? check stack
        else if (ch == ')' || ch == '}' || ch == ']')
        {
            if (s.empty())
                return false; 

            char top = s.top();
            s.pop();

            // Matching check
            if ((ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top != '['))
            {
                return false;
            }
        }
    }

    // stack=empty= balanced
    return s.empty();
}

int main()
{
    string expr;
    cout << "Enter an expression: ";
    cin >> expr;

    if (isBalanced(expr))
        cout << "Balanced Expression" << endl;
    else
        cout << "Unbalanced Expression" << endl;

    return 0;
}

