#include <iostream>
#include <stack>
#include <string>
using namespace std;

int prec(char c)
{
    if (c == '^')
        return 3;
    else if (c == '*' || c == '/')
        return 2;
    else if (c == '+' || c == '-')
        return 1;
    else
        return -1;
}

string infixToPostfix(string s)
{
    stack<char> st;
    string res = "";

    for (int i = 0; i < s.length(); i++)
    {
        char c = s[i];

      
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
        {
            res += c;
        }
      
        else if (c == '(')
        {
            st.push(c);
        }
     
        else if (c == ')')
        {
            while (!st.empty() && st.top() != '(')
            {
                res += st.top();
                st.pop();
            }
            if (!st.empty())
                st.pop(); // remove '('
        }
        // operator case
        else
        {
            while (!st.empty() && prec(st.top()) >= prec(c))
            {
                res += st.top();
                st.pop();
            }
            st.push(c);
        }
    }

    // pop all remaining
    while (!st.empty())
    {
        res += st.top();
        st.pop();
    }

    return res;
}

int main()
{
    string exp;
    cout << "Enter infix expression: ";
    cin >> exp;

    cout << "Postfix expression: " << infixToPostfix(exp) << endl;
    return 0;
}
